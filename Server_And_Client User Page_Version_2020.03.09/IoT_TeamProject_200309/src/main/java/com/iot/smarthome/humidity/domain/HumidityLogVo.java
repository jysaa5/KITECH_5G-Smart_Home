package com.iot.smarthome.humidity.domain;

//HumidityLogVo: 습도 로그 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class HumidityLogVo {
	
	//humidity 로그 인덱스 번호
	private int humidityLogIdx;   
	//humidity 로그 데이터(html)
	private String humidityLogFile;
	//humidity 로그 데이터 저장 시간
	private String humidityLogDate;

	//<생성자>//
	//기본 생성자
	public HumidityLogVo() {
		super();
	}

	//생성자
	public HumidityLogVo(int humidityLogIdx, String humidityLogFile, String humidityLogDate) {
		super();
		this.humidityLogIdx = humidityLogIdx;
		this.humidityLogFile = humidityLogFile;
		this.humidityLogDate = humidityLogDate;
	}

	//getter, setter
	public int getHumidityLogIdx() {
		return humidityLogIdx;
	}

	public void setHumidityLogIdx(int humidityLogIdx) {
		this.humidityLogIdx = humidityLogIdx;
	}

	public String getHumidityLogFile() {
		return humidityLogFile;
	}

	public void setHumidityLogFile(String humidityLogFile) {
		this.humidityLogFile = humidityLogFile;
	}

	public String getHumidityLogDate() {
		return humidityLogDate;
	}

	public void setHumidityLogDate(String humidityLogDate) {
		this.humidityLogDate = humidityLogDate;
	}

	//toString
	@Override
	public String toString() {
		return "HumidityLogVo [humidityLogIdx=" + humidityLogIdx + ", humidityLogFile=" + humidityLogFile
				+ ", humidityLogDate=" + humidityLogDate + "]";
	}



}//HumidityLogVo 클래스 끝
