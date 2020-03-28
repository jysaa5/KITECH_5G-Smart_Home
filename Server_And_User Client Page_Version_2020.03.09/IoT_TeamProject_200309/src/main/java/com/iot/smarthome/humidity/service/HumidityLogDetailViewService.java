package com.iot.smarthome.humidity.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.humidity.dao.HumidityLogDao;
import com.iot.smarthome.humidity.domain.HumidityLogDetailViewVo;


//서비스 bean으로 등록하기 
//HumidityLogDetailViewService: DB에서 idx와 일치하는 humidity 로그를 가져다주는 서비스 클래스 (조회 기능)
@Service("HumidityLogDetailViewService")
public class HumidityLogDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private HumidityLogDao dao;
	
	//getHumidityLogDetailView: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public HumidityLogDetailViewVo getHumidityLogDetailView(int humidityLogIdx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(HumidityLogDao.class);
		
		return dao.selectHumidityLogByIdx(humidityLogIdx);
		
	}//getHumidityLogDetailView 메서드 끝

}//HumidityLogDetailViewService 클래스 끝
