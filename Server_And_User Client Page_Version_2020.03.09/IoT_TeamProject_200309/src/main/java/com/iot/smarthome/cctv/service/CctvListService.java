package com.iot.smarthome.cctv.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.cctv.dao.CctvDao;
import com.iot.smarthome.cctv.domain.CctvEditVo;
import com.iot.smarthome.cctv.domain.CctvListViewVo;

//서비스 bean으로 등록하기 
//CctvListService: cctv 데이터 리스트를 출력하는 sql문을 실행하는 서비스 클래스
@Service("cctvListService")
public class CctvListService {

	//객체 주입
	@Autowired
	private SqlSessionTemplate template;

	//인터페이스
	private CctvDao dao;

	// 한 페이지 표현될 게시글의 개수
	private final int COUNT_PER_PAGE = 7;

	//getCctvListCount 메서드: CctvListViewVo 객체를 반환하는 메서드이다. 
	//페이지 번호를 받으면, 게시글 리스트에서 처음에 시작하는 위치 순서를 계산함.그래서 해당 페이지에 게시될 게시글의 처음 시작 번호와 게시글 수를 주어서 페이지당 일정한 게시글이 보이도록 하는 메서드이다.
	public CctvListViewVo getCctvListCount(int pageNo) {
		
		//dao를 쓸수 있도록 한다.
		dao = template.getMapper(CctvDao.class);
		
		//시작 게시글의 위치 startRow
		int startRow = (pageNo-1)*COUNT_PER_PAGE;
		
		//페이지 표현할 게시글의 리스트
		List<CctvEditVo> list = dao.selectCctvList(startRow, COUNT_PER_PAGE);
		
		//전체 게시글의 개수
		int totalArticleCount = dao.selectCctvCount();
		
		//객체 생성 
		CctvListViewVo listView = new CctvListViewVo(list, totalArticleCount,  pageNo, startRow, COUNT_PER_PAGE);
		
		return listView;
	
	}//getCctvListCount 메서드 끝

}//CctvListService 클래스 끝
