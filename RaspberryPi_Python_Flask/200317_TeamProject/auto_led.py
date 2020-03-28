import RPi.GPIO as GPIO
import smbus   # i2c 라이브러리 호출
import time

#######################################################
# BH1750 조도센서 기본 설정 

# 사용할 i2c 채널 번호
I2C_CH = 1

# BH1750 주소
BH1750_DEV_ADDR = 0x23

# 측정 모드들 - H:HIGH, L:LOW
CONT_H_RES_MODE     = 0x10
CONT_H_RES_MODE2    = 0x11
CONT_L_RES_MODE     = 0x13
ONETIME_H_RES_MODE  = 0x20
ONETIME_H_RES_MODE2 = 0x21
ONETIME_L_RES_MODE  = 0x23
##########################################################

##########################################################
# LED, HC-SR04 기본 설정
LED=16
GPIO_TRIGGER = 21
GPIO_ECHO = 25

GPIO.setmode(GPIO.BCM)
GPIO.setup(LED, GPIO.OUT)
GPIO.setup(GPIO_TRIGGER,GPIO.OUT) 
GPIO.setup(GPIO_ECHO,GPIO.IN)
##########################################################

# 사용할 I2C 채널 라이브러리 생성
i2c = smbus.SMBus(I2C_CH)


# 측정모드 CONT_H_RES_MODE 로 측정하여 2 바이트 읽어오기 
luxBytes = i2c.read_i2c_block_data(BH1750_DEV_ADDR, CONT_H_RES_MODE, 2)
    
# 바이트 배열을 int로 변환
lux = int.from_bytes(luxBytes, byteorder='big')


# 출력
# print('{0} lux'.format(lux))

try:
    while True:
        stop = 0
        start = 0
        # 먼저 트리거 핀을 OFF 상태로 유지한다
        GPIO.output(GPIO_TRIGGER, False)
        time.sleep(2)
 
        # 10us 펄스를 내보낸다. 
        # 파이썬에서 이 펄스는 실제 100us 근처가 될 것이다.
        # 하지만 HC-SR04 센서는 이 오차를 받아준다.
        GPIO.output(GPIO_TRIGGER, True)
        time.sleep(0.1)
        GPIO.output(GPIO_TRIGGER, False)
 
        # 에코 핀이 ON되는 시점을 시작 시간으로 잡는다.
        while GPIO.input(GPIO_ECHO)==0:
            start = time.time()
 
        # 에코 핀이 다시 OFF되는 시점을 반사파 수신 시간으로 잡는다.
        while GPIO.input(GPIO_ECHO)==1:
            stop = time.time()

        # Calculate pulse length
        elapsed = stop-start

        # 초음파는 반사파이기 때문에 실제 이동 거리는 2배이다. 따라서 2로 나눈다.
        # 음속은 편의상 340m/s로 계산한다. 현재 온도를 반영해서 보정할 수 있다.
        if (stop and start):
            distance = (elapsed * 34000.0) / 2
            print("Distance : %.1f cm" % distance)
            if distance <= 200:
                # 측정모드 CONT_H_RES_MODE 로 측정하여 2 바이트 읽어오기 
                luxBytes = i2c.read_i2c_block_data(BH1750_DEV_ADDR, CONT_H_RES_MODE, 2)
                # 바이트 배열을 int로 변환
                lux = int.from_bytes(luxBytes, byteorder='big')
                
                if (lux <= 100): # 조도센서 lux 값이 100 이하면 (=>어두우면)
                    print("LED ON : %d lux"%lux)
                    GPIO.output(LED, True) # 불이 켜짐
                    time.sleep(2)
                else:
                    print("LED OFF : %d lux"%lux) # 조도센서 값이 100보다 크면 (=>밝으면)
                    GPIO.output(LED, False) # 불이 꺼짐
                    time.sleep(2)
            else:
                GPIO.output(LED, False)

except KeyboardInterrupt:
    GPIO.cleanup()