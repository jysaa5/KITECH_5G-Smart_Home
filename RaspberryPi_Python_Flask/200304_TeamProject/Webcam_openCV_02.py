# coding: utf-8

# OpenCV import
import cv2

# 영상을 입력 받을 카메라 디바이스 객체를 생성
cap = cv2.VideoCapture(0)

while True:
    # 카메라 디바이스에 입력된 영상 데이터를 반복적으로 가져옴.
    ret, frame = cap.read() 
    
    # Video라는 이름의 윈도우에 영상 데이터를 보여줌.
    cv2.imshow('Video',frame)

    # 키보드 상의 q키가 눌려 졌는지 확인하여 눌려진 경우 반복문 탈출
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# 카메라 디바이스 객체를 해제
cap.release()

# 사용한 윈도우 제거
cv2.destroyAllWindows()
