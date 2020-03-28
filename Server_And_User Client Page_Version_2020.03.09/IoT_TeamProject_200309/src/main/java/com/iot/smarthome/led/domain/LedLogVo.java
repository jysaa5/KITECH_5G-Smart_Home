package com.iot.smarthome.led.domain;

//LedLogVo: LED 로그 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class LedLogVo {
	
	//led 로그 인덱스 번호
	private int ledLogIdx;   
	//led 로그 데이터(html)
	private String ledLogFile;
	//led 로그 데이터 저장 시간
	private String ledLogDate;

	//<생성자>//
	//기본 생성자
	public LedLogVo() {
		super();
	}

	//생성자
	public LedLogVo(int ledLogIdx, String ledLogFile, String ledLogDate) {
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
		return "LedLogVo [ledLogIdx=" + ledLogIdx + ", ledLogFile=" + ledLogFile + ", ledLogDate=" + ledLogDate + "]";
	}


}//LedLogVo 클래스 끝
