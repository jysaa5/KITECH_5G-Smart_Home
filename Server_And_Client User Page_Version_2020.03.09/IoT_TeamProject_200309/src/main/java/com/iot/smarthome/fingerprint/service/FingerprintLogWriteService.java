package com.iot.smarthome.fingerprint.service;


import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.iot.smarthome.fingerprint.dao.FingerprintLogDao;
import com.iot.smarthome.fingerprint.domain.FingerprintLogVo;
import com.iot.smarthome.fingerprint.domain.FingerprintLogWriteRequestVo;

//서비스 bean으로 등록하기 
//FingerprintLogWriteService: Fingerprint 로그를 작성하는 sql을 실행하는 서비스 클래스
@Service("FingerprintLogWriteService")
public class FingerprintLogWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private FingerprintLogDao dao;
	
	//writeFingerprintLog 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeFingerprintLog(FingerprintLogWriteRequestVo writelog) {
	
		dao = template.getMapper(FingerprintLogDao.class);
		FingerprintLogVo fingerprintlog = writelog.toFingerprintLog();
		
		if(dao.selectFingerprintLogByDate(writelog.getFingerprintLogDate()) != null) {
			return dao.editFingerprintLog(writelog);
		}else {
			return dao.insertFingerprintLog(fingerprintlog);
		}
		
	}//writeFingerprintLog메서드 끝
	
}//FingerprintLogWriteService 클래스 끝
