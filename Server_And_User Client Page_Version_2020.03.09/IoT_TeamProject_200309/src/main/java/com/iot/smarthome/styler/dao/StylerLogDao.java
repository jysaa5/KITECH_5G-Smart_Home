package com.iot.smarthome.styler.dao;

import java.util.List;

import com.iot.smarthome.styler.domain.StylerLogDetailViewVo;
import com.iot.smarthome.styler.domain.StylerLogEditVo;
import com.iot.smarthome.styler.domain.StylerLogVo;
import com.iot.smarthome.styler.domain.StylerLogWriteRequestVo;

//StylerLogDao: Styler log DAO
public interface StylerLogDao {
	
	// styler 로그 파일 저장
	public int insertStylerLog(StylerLogVo stylerLog);

	
	// styler 로그 데이터 저장된 날짜로 select
	public StylerLogEditVo selectStylerLogByDate(String stylerLogDate);
	
	
	// styler 로그 데이터 자세히 보여주기 위해 select
	public StylerLogDetailViewVo selectStylerLogByIdx(int stlyerLogIdx);
	
	
	// styler 로그파일 수정
	public int editStylerLog(StylerLogWriteRequestVo writeLog);
	
	
	// styler 로그 리스트
	public List<StylerLogEditVo> selectStylerLogList(int startRow, int cOUNT_PER_PAGE);
	
	
	// styler 로그 개수
	public int selectStylerLogCount();

}
