package com.iot.smarthome.cctv.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.cctv.dao.CctvLogDao;
import com.iot.smarthome.cctv.domain.CctvLogEditVo;


//서비스 bean으로 등록하기 
//CctvLogViewService: DB에서 로그 파일명과 일치하는 로그명 데이터를 가져다주는 서비스 클래스 (조회 기능)
@Service("CctvLogViewService")
public class CctvLogViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private CctvLogDao dao;
	
	//getCctvidx: cctv 데이터 번호를 반으면 조회하여 찾아주는 메서드
	public CctvLogEditVo getCctvLog(String cctvLogDate) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(CctvLogDao.class);
		
		return dao.selectCctvLogByDate(cctvLogDate);
		
	}//getCctvLog 메서드 끝

}//CctvLogViewService 클래스 끝
