package com.iot.smarthome.led.domain;

import java.sql.Date;

//LedWriteRequestVo: LED 데이저 저장하기 위해 데이터를 담는 클래스
public class LedWriteRequestVo {

	//LED 인덱스 번호
	private int ledIdx;  
	//LED 상태
	private String ledState;
	//LED 데이터 생성 날짜, 시간
	private Date ledDate; 
	
	//기본 생성자
	public LedWriteRequestVo() {
		super();
	}
	
	//생성자
	public LedWriteRequestVo(int ledIdx, String ledState, Date ledDate) {
		super();
		this.ledIdx = ledIdx;
		this.ledState = ledState;
		this.ledDate = ledDate;
	}


	//getter, setter
	public int getLedIdx() {
		return ledIdx;
	}


	public void setLedIdx(int ledIdx) {
		this.ledIdx = ledIdx;
	}


	public String getLedState() {
		return ledState;
	}


	public void setLedState(String ledState) {
		this.ledState = ledState;
	}


	public Date getLedDate() {
		return ledDate;
	}


	public void setLedDate(Date ledDate) {
		this.ledDate = ledDate;
	}

	//toString
	@Override
	public String toString() {
		return "LedWriteRequestVo [ledIdx=" + ledIdx + ", ledState=" + ledState + ", ledDate=" + ledDate + "]";
	}
	
}//LedWriteRequestVo 클래스 끝
