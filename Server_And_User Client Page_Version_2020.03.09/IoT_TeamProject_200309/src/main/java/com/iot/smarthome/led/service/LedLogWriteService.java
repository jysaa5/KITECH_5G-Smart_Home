package com.iot.smarthome.led.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.iot.smarthome.led.dao.LedLogDao;
import com.iot.smarthome.led.domain.LedLogVo;
import com.iot.smarthome.led.domain.LedLogWriteRequestVo;

//서비스 bean으로 등록하기 
//LedLogWriteService: LED 로그를 작성하는 sql을 실행하는 서비스 클래스
@Service("LedLogWriteService")
public class LedLogWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private LedLogDao dao;
	
	//writeFingerprintLog 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeLedLog(LedLogWriteRequestVo writelog) {
	
		dao = template.getMapper(LedLogDao.class);
		LedLogVo ledlog = writelog.toLedLog();
		
		if(dao.selectLedLogByDate(writelog.getLedLogDate()) != null) {
			return dao.editLedLog(writelog);
		}else {
			return dao.insertLedLog(ledlog);
		}
		
	}//writeLedLog메서드 끝
	
}//LedLogWriteService 클래스 끝
