package com.iot.smarthome.led.domain;

//LedLogWriteRequestVo: led 로그 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class LedLogWriteRequestVo {
	
	//led 로그 인덱스 번호
	private int ledLogIdx;   
	//led 로그 데이터(html)
	private String ledLogFile;
	//led 로그 데이터 저장 시간
	private String ledLogDate;
	
	//<생성자>//
	//기본 생성자
	public LedLogWriteRequestVo() {
		super();
	}


	//생성자
	public LedLogWriteRequestVo(int ledLogIdx, String ledLogFile, String ledLogDate) {
		super();
		this.ledLogIdx = ledLogIdx;
		this.ledLogFile = ledLogFile;
		this.ledLogDate = ledLogDate;
	}

	//getter, setter
	public int getLedLogIdx() {
		return ledLogIdx;
	}


	public void setLedLogIdx(int ledLogIdx) {
		this.ledLogIdx = ledLogIdx;
	}


	public String getLedLogFile() {
		return ledLogFile;
	}


	public void setLedLogFile(String ledLogFile) {
		this.ledLogFile = ledLogFile;
	}


	public String getLedLogDate() {
		return ledLogDate;
	}


	public void setLedLogDate(String ledLogDate) {
		this.ledLogDate = ledLogDate;
	}

	
	//toString
	@Override
	public String toString() {
		return "LedLogWriteRequestVo [ledLogIdx=" + ledLogIdx + ", ledLogFile=" + ledLogFile + ", ledLogDate="
				+ ledLogDate + "]";
	}


	//toFingerprintLog 메서드: Fingerprint 도메인의 객체를 반환하는 메서드
	public LedLogVo toLedLog() {
		
		return new LedLogVo(0, ledLogFile,ledLogDate);
	
	}//toLedLog 메서드 끝
	
}//LedLogWriteRequestVo 클래스 끝
