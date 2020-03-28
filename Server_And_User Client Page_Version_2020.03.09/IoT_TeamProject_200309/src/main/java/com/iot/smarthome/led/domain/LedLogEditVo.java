package com.iot.smarthome.led.domain;

//LedLogEditVo: LED 로그 데이터 수정시 데이터를 담는 클래스
public class LedLogEditVo {

	
	//led 로그 인덱스 번호
	private int ledLogIdx;   
	//led 로그 데이터(html)
	private String ledLogFile;
	//led 로그 데이터 저장 시간
	private String ledLogDate;
	
	
	//기본생성자
	public LedLogEditVo() {
		super();
	}


	//생성자
	public LedLogEditVo(int ledLogIdx, String ledLogFile, String ledLogDate) {
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
		return "LedLogEditVo [ledLogIdx=" + ledLogIdx + ", ledLogFile=" + ledLogFile + ", ledLogDate=" + ledLogDate
				+ "]";
	}
	
}//LedLogEditVo 클래스 끝
