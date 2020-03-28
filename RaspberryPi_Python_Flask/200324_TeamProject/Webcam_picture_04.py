# coding: utf-8

import time
import datetime 
import cv2

from flask import Flask, render_template, request

import CaptureDistance as Cd

#log
import Webcam_log as wl

def outputPicture():

    if((Cd.measureD() >= 10) and (Cd.measureD() <= 30)):

        wl.create_log()
        wl.logger.info('ReadyCapture') 

        result = ""
        now = datetime.datetime.now()

         # 영상을 입력 받을 카메라 디바이스 객체 생성
        cap = cv2.VideoCapture(0)
        cap.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
        cap.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)
        wl.logger.info('Capture')
    

        # 카메라 영상 데이터를 가져온다. 변수 frame에 영상이 들어 있다.
        ret, frame = cap.read()

        # 사진 파일명
        #file_name = '{}-{}-{}-{}{}.jpg'.format(now.year, now.month, now.day, now.hour, now.minute)
        file_name = 'photo/{}-{}-{}-{}{}.jpg'.format(now.strftime("%Y"), now.strftime("%m"), now.strftime("%d"), now.strftime("%H"), now.strftime("%M"))


        # file_name.jpg로 영상을 저장한다. 
        cv2.imwrite(file_name,frame)
        wl.logger.info('SaveCapture')
        
        if frame is None:
            print('fail')
            result = "fail"
            wl.logger.error('CaptureFail')
            
        else:
            print('success')
            result = "success"
            wl.logger.info('CaptureSuccess')
     
        #카메라 디바이스 객체를 해제한다.
        cap.release()
        wl.logger.info('exit')

        #return을 여러개 할 수 있다.
        return (result, file_name)


