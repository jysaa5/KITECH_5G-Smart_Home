# coding: utf-8

import cv2
cap = cv2.VideoCapture(0)

ret, frame = cap.read()

cv2.imwrite('test.jpg',frame)

cap.release()

