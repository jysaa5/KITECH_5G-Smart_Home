# coding: utf-8

import Webcam_picture_04 as Wp
import Webcam_screen_03 as Ws

# flask
from flask import Flask, render_template, request

#request
from flask import request

#CORS
from flask_cors import CORS


##################################밑에는 웹에서 처리###########################

app = Flask(__name__)

#Cross origins 이슈 해결
CORS(app)

@app.route('/webcam')
def webcam():
    result = Wp.outputPicture()
    #result = Ws.outputScreen()
    return result

@app.route('/webcam', methods=['POST','GET'])
def webcamPost():
    

@app.route('/webcamView')
def webcamView():
    #result = Wp.outputPicture()
    result = Ws.outputScreen()
    return result

print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.123.100', port=5000, debug=False)
  

