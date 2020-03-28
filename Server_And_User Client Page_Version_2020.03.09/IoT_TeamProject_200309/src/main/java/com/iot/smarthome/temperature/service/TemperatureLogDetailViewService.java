package com.iot.smarthome.temperature.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.temperature.dao.TemperatureLogDao;
import com.iot.smarthome.temperature.domain.TemperatureLogDetailViewVo;

//서비스 bean으로 등록하기 
//TemperatureLogDetailViewService: DB에서 idx와 일치하는 temperature 로그를 가져다주는 서비스 클래스 (조회 기능)
@Service("TemperatureLogDetailViewService")
public class TemperatureLogDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private TemperatureLogDao dao;
	
	//getHumidityLogDetailView: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public TemperatureLogDetailViewVo getTemperatureLogDetailView(int temperatureLogIdx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(TemperatureLogDao.class);
		
		return dao.selectTemperatureLogByIdx(temperatureLogIdx);
		
	}//getTemperatureLogDetailView 메서드 끝

}//TemperatureLogDetailViewService 클래스 끝
