package com.iot.smarthome.fingerprint.domain;

//FingerprintLogVo: 지문인식 로그 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class FingerprintLogVo {
	
	//fingerprint 로그 인덱스 번호
	private int fingerprintLogIdx;   
	//fingerprint 로그 데이터(html)
	private String fingerprintLogFile;
	//fingerprint 로그 데이터 저장 시간
	private String fingerprintLogDate;

	//<생성자>//
	//기본 생성자
	public FingerprintLogVo() {
		super();
	}

	//생성자
	public FingerprintLogVo(int fingerprintLogIdx, String fingerprintLogFile, String fingerprintLogDate) {
		super();
		this.fingerprintLogIdx = fingerprintLogIdx;
		this.fingerprintLogFile = fingerprintLogFile;
		this.fingerprintLogDate = fingerprintLogDate;
	}

	//getter, setter
	public int getFingerprintLogIdx() {
		return fingerprintLogIdx;
	}

	public void setFingerprintLogIdx(int fingerprintLogIdx) {
		this.fingerprintLogIdx = fingerprintLogIdx;
	}

	public String getFingerprintLogFile() {
		return fingerprintLogFile;
	}

	public void setFingerprintLogFile(String fingerprintLogFile) {
		this.fingerprintLogFile = fingerprintLogFile;
	}

	public String getFingerprintLogDate() {
		return fingerprintLogDate;
	}

	public void setFingerprintLogDate(String fingerprintLogDate) {
		this.fingerprintLogDate = fingerprintLogDate;
	}

	//toString
	@Override
	public String toString() {
		return "FingerprintLogVo [fingerprintLogIdx=" + fingerprintLogIdx + ", fingerprintLogFile=" + fingerprintLogFile
				+ ", fingerprintLogDate=" + fingerprintLogDate + "]";
	}


}//FingerprintLogVo 클래스 끝
