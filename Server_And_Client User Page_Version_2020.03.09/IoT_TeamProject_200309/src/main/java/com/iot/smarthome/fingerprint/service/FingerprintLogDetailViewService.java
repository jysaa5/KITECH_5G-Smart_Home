package com.iot.smarthome.fingerprint.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.fingerprint.dao.FingerprintLogDao;
import com.iot.smarthome.fingerprint.domain.FingerprintLogDetailViewVo;

//서비스 bean으로 등록하기 
//FingerprintLogDetailViewService: DB에서 idx와 일치하는 fingerprint 로그를 가져다주는 서비스 클래스 (조회 기능)
@Service("FingerprintLogDetailViewService")
public class FingerprintLogDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private FingerprintLogDao dao;
	
	//getCctvDetailViewIdx: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public FingerprintLogDetailViewVo getFingerprintLogDetailView(int fingerprintLogIdx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(FingerprintLogDao.class);
		
		return dao.selectFingerprintLogByIdx(fingerprintLogIdx);
		
	}//getFingerprintLogDetailView 메서드 끝

}//FingerprintLogDetailViewService 클래스 끝
