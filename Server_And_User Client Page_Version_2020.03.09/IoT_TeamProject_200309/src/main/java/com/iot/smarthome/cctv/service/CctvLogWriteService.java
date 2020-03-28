package com.iot.smarthome.cctv.service;


import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.iot.smarthome.cctv.dao.CctvLogDao;
import com.iot.smarthome.cctv.domain.CctvLogVo;
import com.iot.smarthome.cctv.domain.CctvLogWriteRequestVo;

//서비스 bean으로 등록하기 
//CctvLogWriteService: CCTV 로그를 작성하는 sql을 실행하는 서비스 클래스
@Service("CctvLogWriteService")
public class CctvLogWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private CctvLogDao dao;
	
	//writeCctv 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeCctvLog(CctvLogWriteRequestVo writeLog) {
	
		dao = template.getMapper(CctvLogDao.class);
		CctvLogVo cctvLog = writeLog.toCctvLog();
		
		if(dao.selectCctvLogByDate(writeLog.getCctvLogDate()) != null) {
			return dao.editCctvLog(writeLog);
		}else {
			return dao.insertCctvLog(cctvLog);
		}
		
	}//writeCctvLog메서드 끝
	
}//CctvLogWriteService 클래스 끝
