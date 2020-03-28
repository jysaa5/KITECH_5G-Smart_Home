package com.iot.smarthome.led.domain;

import java.sql.Date;

//LedVo: LED On/Off 데이터를 보관하여 전달하는 도메인 클래스
public class LedVo {
	
	//LED 인덱스 번호
	private int ledIdx;
	//LED 상태
	private String ledState;
	//LED 데이터 생성 날짜, 시간
	private Date ledDate;

	
	//<생성자>//
	//기본 생성자
	public LedVo() {
		super();
	}
	
	//생성자
	public LedVo(int ledIdx, String ledState, Date ledDate) {
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
		return "LedVo [ledIdx=" + ledIdx + ", ledState=" + ledState + ", ledDate=" + ledDate + "]";
	}

	
}//LedVo 클래스 끝
