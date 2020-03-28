package com.iot.smarthome.led.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.led.dao.LedLogDao;
import com.iot.smarthome.led.domain.LedLogDetailViewVo;

//서비스 bean으로 등록하기 
//LedLogDetailViewService: DB에서 idx와 일치하는 LED 로그를 가져다주는 서비스 클래스 (조회 기능)
@Service("LedLogDetailViewService")
public class LedLogDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private LedLogDao dao;
	
	//getCctvDetailViewIdx: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public LedLogDetailViewVo getLedLogDetailView(int ledLogIdx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(LedLogDao.class);
		
		return dao.selectLedLogByIdx(ledLogIdx);
		
	}//getLedLogDetailView 메서드 끝

}//LedLogDetailViewService 클래스 끝
