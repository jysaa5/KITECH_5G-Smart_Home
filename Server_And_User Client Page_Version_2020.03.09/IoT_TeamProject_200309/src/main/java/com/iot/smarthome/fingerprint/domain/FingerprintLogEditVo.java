package com.iot.smarthome.fingerprint.domain;

//FingerprintLogEditVo: 지문인식 로그 데이터 수정시 데이터를 담는 클래스
public class FingerprintLogEditVo {

	
	//fingerprint 로그 인덱스 번호
	private int fingerprintLogIdx;   
	//fingerprint 로그 데이터(html)
	private String fingerprintLogFile;
	//fingerprint 로그 데이터 저장 시간
	private String fingerprintLogDate;
	
	
	//기본생성자
	public FingerprintLogEditVo() {
		super();
	}
	
	//생성자
	public FingerprintLogEditVo(int fingerprintLogIdx, String fingerprintLogFile, String fingerprintLogDate) {
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
		return "FingerprintLogEditVo [fingerprintLogIdx=" + fingerprintLogIdx + ", fingerprintLogFile="
				+ fingerprintLogFile + ", fingerprintLogDate=" + fingerprintLogDate + "]";
	}


}//FingerprintLogEditVo 클래스 끝
