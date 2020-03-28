package com.iot.smarthome.fingerprint.dao;

import java.util.List;

import com.iot.smarthome.fingerprint.domain.FingerprintLogDetailViewVo;
import com.iot.smarthome.fingerprint.domain.FingerprintLogEditVo;
import com.iot.smarthome.fingerprint.domain.FingerprintLogVo;
import com.iot.smarthome.fingerprint.domain.FingerprintLogWriteRequestVo;

public interface FingerprintLogDao {
	
	// fingerprint 로그 파일 저장
	public int insertFingerprintLog(FingerprintLogVo fingerprintlog);

	
	// fingerprint 로그 데이터 저장된 날짜로 select
	public FingerprintLogEditVo selectFingerprintLogByDate(String fingerprintLogDate);
	
	
	// fingerprint 로그 데이터 자세히 보여주기 위해 select
	public FingerprintLogDetailViewVo selectFingerprintLogByIdx(int fingerprintLogIdx);
	
	
	// fingerprint 로그파일 수정
	public int editFingerprintLog(FingerprintLogWriteRequestVo writeLog);
	
	// fingerprint 로그 리스트
	public List<FingerprintLogEditVo> selectFingerprintLogList(int startRow, int cOUNT_PER_PAGE);
	
	// fingerprint 로그 개수
	public int selectFingerprintLogCount();



}
