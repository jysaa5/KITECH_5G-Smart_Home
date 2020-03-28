package com.iot.smarthome.styler.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.iot.smarthome.styler.dao.StylerLogDao;
import com.iot.smarthome.styler.domain.StylerLogVo;
import com.iot.smarthome.styler.domain.StylerLogWriteRequestVo;

//서비스 bean으로 등록하기 
//StylerLogWriteService: Styler 로그를 작성하는 sql을 실행하는 서비스 클래스
@Service("StylerLogWriteService")
public class StylerLogWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private StylerLogDao dao;
	
	//writeStylerLog 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeStylerLog(StylerLogWriteRequestVo writelog) {
	
		dao = template.getMapper(StylerLogDao.class);
		StylerLogVo stylerlog = writelog.toHumidityLog();
		
		if(dao.selectStylerLogByDate(writelog.getStylerLogDate()) != null) {
			return dao.editStylerLog(writelog);
		}else {
			return dao.insertStylerLog(stylerlog);
		}
		
	}//writeStylerLog메서드 끝
	
}//StylerLogWriteService 클래스 끝
