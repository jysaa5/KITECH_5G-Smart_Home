# coding: utf-8

import cv2

#내장카메라 또는 외장 카메라 영상을 받아온다.
#0: 내장 카메라, 1~n: 외장 카메라
capture = cv2.VideoCapture(0)

#프레임의 너비와 높이
capture.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
capture.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)

#영상 출력을 반복
while True:
    ret, frame = capture.read()
    cv2.imshow("VideoFrame", frame)
    if cv2.waitKey(1) > 0 :break

capture.release()
cv2.destroyAllWindows()
