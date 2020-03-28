package com.iot.smarthome.led.dao;

import java.util.List;

import com.iot.smarthome.led.domain.LedLogDetailViewVo;
import com.iot.smarthome.led.domain.LedLogEditVo;
import com.iot.smarthome.led.domain.LedLogVo;
import com.iot.smarthome.led.domain.LedLogWriteRequestVo;

//LedLogDao 인터페이스
public interface LedLogDao {

	// led 로그 파일 저장
	public int insertLedLog(LedLogVo ledLog);
	
	// led 로그 데이터를 저장된 날짜로 select
	public LedLogEditVo selectLedLogByDate(String ledLogDate);
	
	// led 로그 데이터를 idx로 select
	public LedLogDetailViewVo selectLedLogByIdx(int ledLogIdx);
	
	// led 로그파일 수정
	public int editLedLog(LedLogWriteRequestVo writeLog);

	//led 로그 리스트
	public List<LedLogEditVo> selectLedLogList(int startRow, int cOUNT_PER_PAGE);

	//led 로그 개수
	public int selectLedLogCount();



}//LedLogDao 인터페이스 끝
