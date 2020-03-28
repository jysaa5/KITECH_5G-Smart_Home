package com.iot.smarthome.cctv.dao;


import java.util.List;

import com.iot.smarthome.cctv.domain.CctvLogDetailViewVo;
import com.iot.smarthome.cctv.domain.CctvLogEditVo;
import com.iot.smarthome.cctv.domain.CctvLogVo;
import com.iot.smarthome.cctv.domain.CctvLogWriteRequestVo;

public interface CctvLogDao {

	//cctv 로그 데이터 저장
	public int insertCctvLog(CctvLogVo cctvLog);

	//cctv 로그 데이터를 보여주기 위해 select
	public CctvLogEditVo selectCctvLogByDate(String cctvLogDate);
	
	//cctv 로그 데이터 자세히 보여주기 위해 select
	public CctvLogDetailViewVo selectCctvLogByIdx(int cctvLogIdx);

	//cctv 로그 수정
	public int editCctvLog(CctvLogWriteRequestVo writeLog);

	//cctv 로그 리스트
	public List<CctvLogEditVo> selectCctvLogList(int startRow, int cOUNT_PER_PAGE);

	//cctv 로그 개수
	public int selectCctvLogCount();


	


	

}
