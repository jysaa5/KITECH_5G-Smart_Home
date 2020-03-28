package com.iot.smarthome.styler.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.styler.dao.StylerDao;
import com.iot.smarthome.styler.domain.StylerRecommendationVo;

//서비스 bean으로 등록하기 
//StylerRecommendationService: 사진 DB idx와 일치하는 사진을 가져다주는 서비스 클래스 (조회 기능)
@Service("StylerRecommendationService")
public class StylerRecommendationService {

	@Autowired
	private SqlSessionTemplate template;

	// 인터페이스
	private StylerDao dao;

	// getRecommendationPhoto: 사진 DB의 idx를 랜덤으로 조회하여 찾아주는 메서드
	public StylerRecommendationVo getRecommendationStyler(int stylerIdx) {

		// 인터페이스 구현, SQL문 실행
		dao = template.getMapper(StylerDao.class);

		int totalArticleCount = dao.selectStylerCount();

		double ran = 0;
		int randomNum = 0;
		
		while (true) {
			
			ran = Math.random();
			randomNum = (int) (ran * 100) + 1;
			
			if (totalArticleCount >= randomNum) {
				break;
			}
		}

		stylerIdx = randomNum;

		return dao.selectStylerByIdx3(stylerIdx);

	}//getRecommendationStyler 메서드 끝

}//StylerRecommendationService 클래스 끝
