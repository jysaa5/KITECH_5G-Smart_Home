# coding: utf-8

#log
import logging

#time
import time
import datetime 

#시간 설정
now = datetime.datetime.now()
#log 생성 시작
logger = logging.getLogger('styler')


def create_log():

    #log 파일 생성 
    hand = logging.FileHandler('styler-{}-{}-{}.log'.format(now.strftime("%Y"), now.strftime("%m"), now.strftime("%d")))
    formatter = logging.Formatter('%(asctime)s %(levelname)s %(process)d %(message)s')
    hand.setFormatter(formatter)
    logger.addHandler(hand)
    logger.setLevel(logging.INFO)


# logger.debug('Wrong')
# logger.info('Ready')
# logger.warning('Warning') #기본적으로 여기서부터 시작함. default level
# logger.error('Error')
# logger.critical('critical')