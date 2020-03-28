package com.iot.smarthome.cctv.domain;

//CctvLogWriteRequestVo: CCTV 로그 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class CctvLogWriteRequestVo {
	
	//cctv 로그 인덱스 번호
	private int cctvLogIdx;   
	//cctv 로그 데이터(html)
	private String cctvLogFile;
	//cctv 로그 데이터 받는 시간
	private String cctvLogDate;
	
	//<생성자>//
	//기본 생성자
	public CctvLogWriteRequestVo() {
		super();
	}
	
	//생성자
	public CctvLogWriteRequestVo(int cctvLogIdx, String cctvLogFile, String cctvLogDate) {
		super();
		this.cctvLogIdx = cctvLogIdx;
		this.cctvLogFile = cctvLogFile;
		this.cctvLogDate = cctvLogDate;
	}
	
	//getter, setter
	public int getCctvLogIdx() {
		return cctvLogIdx;
	}

	public void setCctvLogIdx(int cctvLogIdx) {
		this.cctvLogIdx = cctvLogIdx;
	}

	public String getCctvLogFile() {
		return cctvLogFile;
	}

	public void setCctvLogFile(String cctvLogFile) {
		this.cctvLogFile = cctvLogFile;
	}

	public String getCctvLogDate() {
		return cctvLogDate;
	}

	public void setCctvLogDate(String cctvLogDate) {
		this.cctvLogDate = cctvLogDate;
	}
	
	//toString
	@Override
	public String toString() {
		return "CctvLogWriteRequestVo [cctvLogIdx=" + cctvLogIdx + ", cctvLogFile=" + cctvLogFile + ", cctvLogDate="
				+ cctvLogDate + "]";
	}

	//toCctvLog 메서드: CctvLogVo 도메인의 객체를 반환하는 메서드
	public CctvLogVo toCctvLog() {
		
		return new CctvLogVo(0, cctvLogFile, cctvLogDate);
	
	}//toCctvLog 메서드 끝
	
}//CctvLogWriteRequestVo 클래스 끝
