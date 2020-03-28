package com.iot.smarthome.styler.dao;

import java.util.List;

import com.iot.smarthome.styler.domain.StylerDetailViewVo;
import com.iot.smarthome.styler.domain.StylerEditVo;
import com.iot.smarthome.styler.domain.StylerRecommendationVo;
import com.iot.smarthome.styler.domain.StylerVo;

//StylerDao 인터페이스
public interface StylerDao {

	//사진 저장
	public int insertStyler(StylerVo styler);

	//사진 인덱스 찾기 - 리스트
	public StylerEditVo selectStylerByIdx1(int stylerIdx);

	//사진 인덱스 찾기 - 디테일 뷰
	public StylerDetailViewVo selectStylerByIdx2(int stylerIdx);

	//사진 리스트 번호 
	public List<StylerEditVo> selectStylerList(int startRow, int cOUNT_PER_PAGE);

	//사진 전체 개수 체크
	public int selectStylerCount();

	//사진 인덱스 찾기 - 스타일 추천
	public StylerRecommendationVo selectStylerByIdx3(int stylerIdx);
	
}//StylerDao 인터페이스 끝
