# coding: utf-8
import pandas as pd
import Led_onoff as Led
import Webcam_picture_04 as Wp
import CaptureDistance as Cd


# flask
from flask import Flask, render_template, Response, jsonify, make_response

#request
from flask import request

#CORS
from flask_cors import CORS

# GPIO
import RPi.GPIO as GPIO

#requests
import requests
import json

import time
import datetime 

##################################밑에는 웹에서 처리###########################

now = datetime.datetime.now()
app = Flask(__name__)

#Cross origins 이슈 해결
CORS(app)

@app.route('/webcam')
def webcam():
    
    result, file_name = Wp.outputPicture()
    #result = Ws.outputScreen()
    
    #파일명 출력
    print(file_name)
    
    #서버 url
    url = 'http://ec2-13-209-26-197.ap-northeast-2.compute.amazonaws.com:8080/smarthome/styler/write'
    #파일 열기
    files = {'photo':open(file_name,'rb')}
    data = {'stylerUser': 'scott'}
    r = requests.post(url, data=data, files=files)
    r.text
    print(r.text)

    if r.ok:
        return "File uploaded!"
    else:
        return "Error uploading file!"



@app.route('/light_on')
def light_on():
    state = 'light_on'
    Led.light(state)
    url = 'http://ec2-13-209-26-197.ap-northeast-2.compute.amazonaws.com:8080/smarthome/led/write'
    
    data = {'ledState': 'light_on'}
    r = requests.post(url, data=data)
    r.text
    print(r.text)

    if r.ok:
        return "light on"
    else:
        return "Error turning led!"



@app.route('/light_off')
def light_off():
    state = 'light_off'
    Led.light(state)

    url = 'http://ec2-13-209-26-197.ap-northeast-2.compute.amazonaws.com:8080/smarthome/led/write'
    
    data = {'ledState': 'light_off'}
    r = requests.post(url, data=data)
    r.text
    print(r.text)

    if r.ok:
        return "light off"
    else:
        return "Error turning led!"




@app.route("/log/<ledDate>", methods =['GET'])
def led_log(ledDate):

    data_dic = ledDate

    try:
        # 로그파일 불러오기
        df = pd.read_csv("buttonLed-"+data_dic+".log", sep=' ', \
                    names=['날짜', '시간','로그레벨', '프로세스ID', '점등여부'], \
                    header=None)
    
        # '점등여부' 중 LedOn, LedOff만 output / ReadyLed 제외
        df_cond = df[(df['점등여부'] == 'LedOn') | (df['점등여부'] == 'LedOff')]

        # '날짜', '시간', '점등여부' 컬럼만 output
        led_df = df_cond.loc[:, ['날짜', '시간', '점등여부']]

        return led_df.to_html(justify='center')
        
    except:
        return "Error"  



@app.route("/log/<stylerDate>", methods =['GET'])
def styler_log(stylerDate):

    data_dic = stylerDate

    try:
        # 로그파일 불러오기
        df = pd.read_csv("styler-"+data_dic+".log", sep=' ', \
                    names=['날짜', '시간','로그레벨', '프로세스ID', '촬영여부'], \
                    header=None)
    
        # '촬영여부' 중 ReadyCapture, CaptureSuccess만 output / Capture, SaveCapture, exit 제외
        df_cond = df[(df['촬영여부'] == 'ReadyCapture') | (df['촬영여부'] == 'CaptureSuccess')]

        # '날짜', '시간', '촬영여부' 컬럼만 output
        styler_df = df_cond.loc[:, ['날짜', '시간', '촬영여부']]

        return styler_df.to_html(justify='center')

    except:
        return "Error"



print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.0.66', port=5000, debug=False)
  

