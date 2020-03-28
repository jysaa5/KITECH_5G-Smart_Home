package com.iot.smarthome.humidity.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.iot.smarthome.humidity.dao.HumidityLogDao;
import com.iot.smarthome.humidity.domain.HumidityLogVo;
import com.iot.smarthome.humidity.domain.HumidityLogWriteRequestVo;

//서비스 bean으로 등록하기 
//HumidityLogWriteService: Humidity 로그를 작성하는 sql을 실행하는 서비스 클래스
@Service("HumidityLogWriteService")
public class HumidityLogWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private HumidityLogDao dao;
	
	//writeHumidityLog 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeHumidityLog(HumidityLogWriteRequestVo writelog) {
	
		dao = template.getMapper(HumidityLogDao.class);
		HumidityLogVo humiditylog = writelog.toHumidityLog();
		
		if(dao.selectHumidityLogByDate(writelog.getHumidityLogDate()) != null) {
			return dao.editHumidityLog(writelog);
		}else {
			return dao.insertHumidityLog(humiditylog);
		}
		
	}//writeHumidityLog메서드 끝
	
}//HumidityLogWriteService 클래스 끝
