# coding: utf-8

# OpenCV import
import cv2

# 영상을 입력받을 카메라 디바이스 객체를 생성
cap = cv2.VideoCapture(0)

# 카메라에서 영상 데이터를 가져옴. 변수 frame에 영상이 들어 있음.
ret, frame = cap.read()

# testKite.jpg 파일에 영상을 저장
cv2.imwrite('testKite.jpg',frame)

# 카메라 디바이스 객체를 해제
cap.release()

