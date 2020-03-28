package com.iot.smarthome.cctv.domain;


//CctvLogDetailViewVo: cctv 로그를 보기 위해 저장되어 있던 데이터를 담는 도메인 클래스
public class CctvLogDetailViewVo {

	//cctv 로그 인덱스 번호
	private int cctvLogIdx;   
	//cctv 로그 데이터(html)
	private String cctvLogFile;
	//cctv 로그 데이터 받는 시간
	private String cctvLogDate;

	
	//<생성자>//
	//기본 생성자
	public CctvLogDetailViewVo() {
		super();
	}


	//생성자
	public CctvLogDetailViewVo(int cctvLogIdx, String cctvLogFile, String cctvLogDate) {
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
		return "CctvLogDetailViewVo [cctvLogIdx=" + cctvLogIdx + ", cctvLogFile=" + cctvLogFile + ", cctvLogDate="
				+ cctvLogDate + "]";
	}

	


}//CctvLogDetailViewVo 클래스 끝
