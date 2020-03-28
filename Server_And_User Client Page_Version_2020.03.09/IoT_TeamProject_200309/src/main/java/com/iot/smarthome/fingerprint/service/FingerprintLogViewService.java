package com.iot.smarthome.fingerprint.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.fingerprint.dao.FingerprintLogDao;
import com.iot.smarthome.fingerprint.domain.FingerprintLogEditVo;


//서비스 bean으로 등록하기 
//FingerprintLogViewService: DB에서 로그 파일명과 일치하는 로그가 저장된 날짜와 일치하는 데이터를 가져다주는 서비스 클래스 (조회 기능)
@Service("FingerprintLogViewService")
public class FingerprintLogViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private FingerprintLogDao dao;
	
	//getCctvLogFileName: fingerprint 데이터 날짜을 받으면 조회하여 찾아주는 메서드
	public FingerprintLogEditVo getFingerprintLog(String fingerprintLogDate) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(FingerprintLogDao.class);
		
		return dao.selectFingerprintLogByDate(fingerprintLogDate);
		
	}//getFingerprintLog 메서드 끝

}//FingerprintLogViewService 클래스 끝
