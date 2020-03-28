package com.iot.smarthome.styler.domain;

//StylerLogVo: Styler 로그 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class StylerLogVo {
	
	//styler 로그 인덱스 번호
	private int stylerLogIdx;   
	//styler 로그 데이터(html)
	private String stylerLogFile;
	//styler 로그 데이터 저장 시간
	private String stylerLogDate;

	//<생성자>//
	//기본 생성자
	public StylerLogVo() {
		super();
	}

	//생성자
	public StylerLogVo(int stylerLogIdx, String stylerLogFile, String stylerLogDate) {
		super();
		this.stylerLogIdx = stylerLogIdx;
		this.stylerLogFile = stylerLogFile;
		this.stylerLogDate = stylerLogDate;
	}

	//getter, setter
	public int getStylerLogIdx() {
		return stylerLogIdx;
	}

	public void setStylerLogIdx(int stylerLogIdx) {
		this.stylerLogIdx = stylerLogIdx;
	}

	public String getStylerLogFile() {
		return stylerLogFile;
	}

	public void setStylerLogFile(String stylerLogFile) {
		this.stylerLogFile = stylerLogFile;
	}

	public String getStylerLogDate() {
		return stylerLogDate;
	}

	public void setStylerLogDate(String stylerLogDate) {
		this.stylerLogDate = stylerLogDate;
	}

	//toString
	@Override
	public String toString() {
		return "StylerLogVo [stylerLogIdx=" + stylerLogIdx + ", stylerLogFile=" + stylerLogFile + ", stylerLogDate="
				+ stylerLogDate + "]";
	}



}//StylerLogVo 클래스 끝
