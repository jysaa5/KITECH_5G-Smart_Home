package com.iot.smarthome.cctv.dao;

import java.util.List;

import com.iot.smarthome.cctv.domain.CctvDetailViewVo;
import com.iot.smarthome.cctv.domain.CctvEditVo;
import com.iot.smarthome.cctv.domain.CctvVo;

//CctvDao 인터페이스
public interface CctvDao {

	//사진 또는 영상 저장
	public int insertCctv(CctvVo cctv);

	//사진, 영상 리스트 보기
	public List<CctvEditVo> selectCctvList(int startRow, int cOUNT_PER_PAGE);

	//사진, 영상 리스트 개수
	public int selectCctvCount();

	//사진, 영상 인덱스로 찾기1
	public CctvEditVo selectCctvByIdx1(int idx);

	//사진, 영상 인덱스로 찾기2
	public CctvDetailViewVo selectCctvByIdx2(int idx);

}//CctvDao 인터페이스 끝
