package com.iot.smarthome.led.dao;

import com.iot.smarthome.led.domain.LedWriteRequestVo;

//LedDao 인터페이스
public interface LedDao {

	//LED On/Off 데이터 입력
	int insertLed(LedWriteRequestVo write);

}//LedDao 인터페이스 끝
