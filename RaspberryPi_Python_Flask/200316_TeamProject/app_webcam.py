# coding: utf-8

import Webcam_picture_04 as Wp
import Webcam_screen_03 as Ws

# flask
from flask import Flask, render_template

#request
from flask import request

#CORS
from flask_cors import CORS

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
    url = 'http://192.168.0.23:8080/smarthome/styler/write'
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


# @app.route('/webcam', methods=['POST','GET'])
# def webcamPost():
    

# @app.route('/webcamView')
# def webcamView():
#     #result = Wp.outputPicture()
#     result = Ws.outputScreen()
#     return result

print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.0.66', port=5000, debug=False)
  

