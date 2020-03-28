# coding: utf-8
# GPIO
import RPi.GPIO as GPIO

# 조명 16번 핀 출력 핀으로 등록, 초기 출력 LOW 


def light(state):
    GPIO.cleanup()
    GPIO.setmode(GPIO.BOARD)
    LED = 16
    GPIO.setup(LED, GPIO.OUT, initial = GPIO.LOW)
    
    if state == 'light_on':
        GPIO.output(LED, GPIO.HIGH)
        print ('=====================>LED: ', GPIO.input(LED))
        
        return 'light on'
    
    elif state == 'light_off':
        GPIO.output(LED, GPIO.LOW)
        print ('=====================>LED: ', GPIO.input(LED))
        
        return 'light off' 
