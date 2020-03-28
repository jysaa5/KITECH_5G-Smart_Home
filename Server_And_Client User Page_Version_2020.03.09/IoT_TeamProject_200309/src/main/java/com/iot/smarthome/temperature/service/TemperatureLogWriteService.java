package com.iot.smarthome.temperature.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.iot.smarthome.temperature.dao.TemperatureLogDao;
import com.iot.smarthome.temperature.domain.TemperatureLogVo;
import com.iot.smarthome.temperature.domain.TemperatureLogWriteRequestVo;

//서비스 bean으로 등록하기 
//TemperatureLogWriteService: Temperature 로그를 작성하는 sql을 실행하는 서비스 클래스
@Service("TemperatureLogWriteService")
public class TemperatureLogWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private TemperatureLogDao dao;
	
	//writeTemperatureLog 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeTemperatureLog(TemperatureLogWriteRequestVo writeLog) {
	
		dao = template.getMapper(TemperatureLogDao.class);
		TemperatureLogVo TemperatureLog = writeLog.toTemperatureLog();
		
		if(dao.selectTemperatureLogByDate(writeLog.getTemperatureLogDate()) != null) {
			return dao.editTemperatureLog(writeLog);
		}else {
			return dao.insertTemperatureLog(TemperatureLog);
		}
		
	}//writeTemperatureLog메서드 끝
	
}//TemperatureLogWriteService 클래스 끝
