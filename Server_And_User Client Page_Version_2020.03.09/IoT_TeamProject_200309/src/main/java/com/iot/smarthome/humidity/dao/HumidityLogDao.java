package com.iot.smarthome.humidity.dao;

import java.util.List;

import com.iot.smarthome.humidity.domain.HumidityLogDetailViewVo;
import com.iot.smarthome.humidity.domain.HumidityLogEditVo;
import com.iot.smarthome.humidity.domain.HumidityLogVo;
import com.iot.smarthome.humidity.domain.HumidityLogWriteRequestVo;

//HumidityLogDao: 습도 DAO
public interface HumidityLogDao {
	
	// humidity 로그 파일 저장
	public int insertHumidityLog(HumidityLogVo humidityLog);

	
	// humidity 로그 데이터 저장된 날짜로 select
	public HumidityLogEditVo selectHumidityLogByDate(String humidityLogDate);
	
	
	// humidity 로그 데이터 자세히 보여주기 위해 select
	public HumidityLogDetailViewVo selectHumidityLogByIdx(int humidityLogIdx);
	
	
	// humidity 로그파일 수정
	public int editHumidityLog(HumidityLogWriteRequestVo writeLog);
	
	
	// humidity 로그 리스트
	public List<HumidityLogEditVo> selectHumidityLogList(int startRow, int cOUNT_PER_PAGE);
	
	
	// humidity 로그 개수
	public int selectHumidityLogCount();

}
