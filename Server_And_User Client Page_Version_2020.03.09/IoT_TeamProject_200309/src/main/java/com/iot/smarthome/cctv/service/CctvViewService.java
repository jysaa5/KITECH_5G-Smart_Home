package com.iot.smarthome.cctv.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.cctv.dao.CctvDao;
import com.iot.smarthome.cctv.domain.CctvEditVo;


//서비스 bean으로 등록하기 
//CctvViewService: DB에서 idx와 일치하는 사진, 동영상 데이터를 가져다주는 서비스 클래스 (조회 기능)
@Service("CctvViewService")
public class CctvViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private CctvDao dao;
	
	//getCctvidx: cctv 데이터 번호를 반으면 조회하여 찾아주는 메서드
	public CctvEditVo getCctvidx(int idx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(CctvDao.class);
		
		return dao.selectCctvByIdx1(idx);
		
	}//getCctvidx 메서드 끝

}//CctvViewService 클래스 끝
