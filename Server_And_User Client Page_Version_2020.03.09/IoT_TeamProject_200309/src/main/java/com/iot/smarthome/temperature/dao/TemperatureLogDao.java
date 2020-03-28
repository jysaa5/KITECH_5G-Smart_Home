package com.iot.smarthome.temperature.dao;

import java.util.List;

import com.iot.smarthome.temperature.domain.TemperatureLogDetailViewVo;
import com.iot.smarthome.temperature.domain.TemperatureLogEditVo;
import com.iot.smarthome.temperature.domain.TemperatureLogVo;
import com.iot.smarthome.temperature.domain.TemperatureLogWriteRequestVo;

//TemperatureLogDao: 온도 DAO
public interface TemperatureLogDao {
	
	// temperature 로그 파일 저장
	public int insertTemperatureLog(TemperatureLogVo temperatureLog);

	
	// temperature 로그 데이터 저장된 날짜로 select
	public TemperatureLogEditVo selectTemperatureLogByDate(String temperatureLogDate);
	
	
	// temperature 로그 데이터 자세히 보여주기 위해 select
	public TemperatureLogDetailViewVo selectTemperatureLogByIdx(int temperatureLogIdx);
	
	
	// temperature 로그파일 수정
	public int editTemperatureLog(TemperatureLogWriteRequestVo writeLog);
	
	
	// temperature 로그 리스트
	public List<TemperatureLogEditVo> selectTemperatureLogList(int startRow, int cOUNT_PER_PAGE);
	
	
	// temperature 로그 개수
	public int selectTemperatureLogCount();

}
