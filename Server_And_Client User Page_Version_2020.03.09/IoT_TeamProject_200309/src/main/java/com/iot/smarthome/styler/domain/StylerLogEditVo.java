package com.iot.smarthome.styler.domain;

//StylerLogEditVo: Styler 로그 데이터 수정시 데이터를 담는 클래스
public class StylerLogEditVo {

	//styler 로그 인덱스 번호
	private int stylerLogIdx;   
	//styler 로그 데이터(html)
	private String stylerLogFile;
	//styler 로그 데이터 저장 시간
	private String stylerLogDate;

	
	//기본생성자
	public StylerLogEditVo() {
		super();
	}
	
	//생성자
	public StylerLogEditVo(int stylerLogIdx, String stylerLogFile, String stylerLogDate) {
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
		return "StylerLogEditVo [stylerLogIdx=" + stylerLogIdx + ", stylerLogFile=" + stylerLogFile + ", stylerLogDate="
				+ stylerLogDate + "]";
	}

}//StylerLogEditVo 클래스 끝
