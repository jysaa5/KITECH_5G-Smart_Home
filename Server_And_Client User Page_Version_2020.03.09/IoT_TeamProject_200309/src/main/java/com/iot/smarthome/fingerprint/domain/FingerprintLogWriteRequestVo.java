package com.iot.smarthome.fingerprint.domain;


//FingerprintLogWriteRequestVo: Fingerprint 로그 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class FingerprintLogWriteRequestVo {
	
	//fingerprint 로그 인덱스 번호
	private int fingerprintLogIdx;   
	//fingerprint 로그 데이터(html)
	private String fingerprintLogFile;
	//fingerprint 로그 데이터 저장 시간
	private String fingerprintLogDate;
	
	//<생성자>//
	//기본 생성자
	public FingerprintLogWriteRequestVo() {
		super();
	}

	//생성자
	public FingerprintLogWriteRequestVo(int fingerprintLogIdx, String fingerprintLogFile, String fingerprintLogDate) {
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



	
	//생성자
	@Override
	public String toString() {
		return "FingerprintLogWriteRequestVo [fingerprintLogIdx=" + fingerprintLogIdx + ", fingerprintLogFile="
				+ fingerprintLogFile + ", fingerprintLogDate=" + fingerprintLogDate + "]";
	}



	//toFingerprintLog 메서드: FingerprintLogVo 도메인의 객체를 반환하는 메서드
	public FingerprintLogVo toFingerprintLog() {
		
		return new FingerprintLogVo(0, fingerprintLogFile,fingerprintLogDate );
	
	}//toFingerprintLog 메서드 끝
	
}//FingerprintLogWriteRequestVo 클래스 끝
