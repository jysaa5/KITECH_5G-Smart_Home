import RPi.GPIO as GPIO
import time as time

def measureD():
    GPIO.setmode(GPIO.BCM)
    GPIO.setwarnings(False)
    
    trig = 13
    echo = 19
    
    GPIO.setup(trig, GPIO.OUT)
    GPIO.setup(echo, GPIO.IN)
    
    try:
        while True:
            GPIO.output(trig, False)
            time.sleep(0.5)
            
            GPIO.output(trig, True)
            time.sleep(0.00001)
            GPIO.output(trig, False)
            
            while GPIO.input(echo) == 0: 
                pulse_start = time.time()
              
            while GPIO.input(echo) == 1:
                pulse_end = time.time()
            
            pulse_duration = pulse_end - pulse_start
            distance = pulse_duration * 17000
            distance = round(distance, 2)

            if((10<=distance) and (distance<=30)):
                print("Distance : ", distance, "cm")
                
                return distance
        
    except:
        GPIO.cleanup()
