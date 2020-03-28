package com.iot.smarthome.styler.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.styler.dao.StylerLogDao;
import com.iot.smarthome.styler.domain.StylerLogDetailViewVo;

//서비스 bean으로 등록하기 
//StylerLogDetailViewService: DB에서 idx와 일치하는 styler 로그를 가져다주는 서비스 클래스 (조회 기능)
@Service("StylerLogDetailViewService")
public class StylerLogDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private StylerLogDao dao;
	
	//getStylerLogDetailView: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public StylerLogDetailViewVo getStylerLogDetailView(int stylerLogIdx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(StylerLogDao.class);
		
		return dao.selectStylerLogByIdx(stylerLogIdx);
		
	}//getStylerLogDetailView 메서드 끝

}//StylerLogDetailViewService 클래스 끝
