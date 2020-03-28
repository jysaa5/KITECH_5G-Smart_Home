#coding: utf-8

#flask
from flask import Flask
#request
from flask import request

#CORS
from flask_cors import CORS

#GPIO 라이브러리
import RPi.GPIO as GPIO

from Module_TeamProject_200226 import Webcam_01 as webCamModule

##############################################################################
#핀 번호 할당 방법은 커넥터 핀 번호로 설정
#GPIO.setmode(GPIO.BOARD)

#pin 번호 channel
#LED = 11 

#11번 핀 설정/ 11번 핀을 출력 핀으로 설정, 초기 출력 로우 레벨
#GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)

#PWM 객체 생성: 11번 핀, 주파수 - 100Hz
#p = GPIO.PWM(LED, 100)

#PWM 신호 출력
#p.start(0)

#duty 값을 변경 함수 정의
#def change_duty(dc):
#    p.ChangeDutyCycle(dc) #듀티 비 변경

##############################################################################

app = Flask(__name__)
CORS(app)

@app.route('/')
def index():
    # led = request.args.get('led', 'g') #key = led , default = 'g'
    # p_val = request.args.get('p_val','0') #led의 밝기
    # change_duty(int(p_val))  #형변환 -> 여기 부분 예외처리 필요함. 
    # return led + ':' + p_val
    webCamModule
    

if __name__ == '__main__':
    app.run(host='192.168.0.66', port ='5000') 