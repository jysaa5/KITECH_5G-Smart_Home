# coding: utf-8
import Led_onoff as Led

# flask
from flask import Flask, render_template

# request
from flask import request

# CORS
from flask_cors import CORS

# GPIO
import RPi.GPIO as GPIO

#requests
import requests
import json

import time
import datetime 



now = datetime.datetime.now()
app = Flask(__name__)

#Cross origins 이슈 해결
CORS(app)

@app.route('/light_on')
def light_on():
    state = 'light_on'
    Led.light(state)
    url = 'http://192.168.0.23:8080/smarthome/led/write'
    
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

    url = 'http://192.168.0.23:8080/smarthome/led/write'
    
    data = {'ledState': 'light_off'}
    r = requests.post(url, data=data)
    r.text
    print(r.text)

    if r.ok:
        return "light off"
    else:
        return "Error turning led!"




print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.0.66', port=5000, debug=False)