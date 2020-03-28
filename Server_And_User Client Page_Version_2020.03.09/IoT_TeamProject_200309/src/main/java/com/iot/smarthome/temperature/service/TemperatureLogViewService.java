package com.iot.smarthome.temperature.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.temperature.dao.TemperatureLogDao;
import com.iot.smarthome.temperature.domain.TemperatureLogEditVo;

//서비스 bean으로 등록하기 
//TemperatureLogViewService: DB에서 로그 파일명과 일치하는 로그가 저장된 날짜와 일치하는 데이터를 가져다주는 서비스 클래스 (조회 기능)
@Service("TemperatureLogViewService")
public class TemperatureLogViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private TemperatureLogDao dao;
	
	//getCctvLogFileName: fingerprint 데이터 날짜을 받으면 조회하여 찾아주는 메서드
	public TemperatureLogEditVo getTemperatureLog(String temperatureLogDate) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(TemperatureLogDao.class);
		
		return dao.selectTemperatureLogByDate(temperatureLogDate);
		
	}//getTemperatureLog 메서드 끝

}//TemperatureLogViewService 클래스 끝
