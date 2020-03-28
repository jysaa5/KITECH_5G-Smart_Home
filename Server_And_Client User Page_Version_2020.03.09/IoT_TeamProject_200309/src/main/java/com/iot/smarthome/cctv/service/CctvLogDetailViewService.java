package com.iot.smarthome.cctv.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.cctv.dao.CctvLogDao;
import com.iot.smarthome.cctv.domain.CctvLogDetailViewVo;


//서비스 bean으로 등록하기 
//CctvLogDetailViewService: DB에서 idx와 일치하는 cctv 로그를 가져다주는 서비스 클래스 (조회 기능)
@Service("CctvLogDetailViewService")
public class CctvLogDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private CctvLogDao dao;
	
	//getCctvDetailViewIdx: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public CctvLogDetailViewVo getCctvLogDetailView(int cctvLogIdx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(CctvLogDao.class);
		
		return dao.selectCctvLogByIdx(cctvLogIdx);
		
	}//getCctvLogDetailView 메서드 끝

}//CctvLogDetailViewService 클래스 끝
