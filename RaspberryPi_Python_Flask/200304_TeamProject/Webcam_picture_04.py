# coding: utf-8

import time
import datetime 
import cv2

from flask import Flask, render_template, request

def outputPicture():
    
    result = ""
    now = datetime.datetime.now()

    # 영상을 입력 받을 카메라 디바이스 객체 생성
    cap = cv2.VideoCapture(0)
    cap.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
    cap.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)
    

    # 카메라 영상 데이터를 가져온다. 변수 frame에 영상이 들어 있다.
    ret, frame = cap.read()

    # 사진 파일명
    #file_name = '{}-{}-{}-{}{}.jpg'.format(now.year, now.month, now.day, now.hour, now.minute)
    file_name = '{}-{}-{}-{}{}.jpg'.format(now.strftime("%Y"), now.strftime("%m"), now.strftime("%d"), now.strftime("%H"), now.strftime("%M"))


    # file_name.jpg로 영상을 저장한다. 
    cv2.imwrite(file_name,frame)
            
    if frame is None:
        print('fail')
        result = "fail"
            
    else:
        print('success')
        result = "success"
     
    #카메라 디바이스 객체를 해제한다.
    cap.release()

    return result


