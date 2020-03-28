package com.iot.smarthome.temperature.domain;

//TemperatureLogVo: temperature 로그 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class TemperatureLogVo {
	
	//temperature 로그 인덱스 번호
	private int temperatureLogIdx;   
	//temperature 로그 데이터(html)
	private String temperatureLogFile;
	//temperature 로그 데이터 저장 시간
	private String temperatureLogDate;

	//<생성자>//
	//기본 생성자
	public TemperatureLogVo() {
		super();
	}

	//생성자
	public TemperatureLogVo(int temperatureLogIdx, String temperatureLogFile, String temperatureLogDate) {
		super();
		this.temperatureLogIdx = temperatureLogIdx;
		this.temperatureLogFile = temperatureLogFile;
		this.temperatureLogDate = temperatureLogDate;
	}

	//getter, setter
	public int getTemperatureLogIdx() {
		return temperatureLogIdx;
	}

	public void setTemperatureLogIdx(int temperatureLogIdx) {
		this.temperatureLogIdx = temperatureLogIdx;
	}

	public String getTemperatureLogFile() {
		return temperatureLogFile;
	}

	public void setTemperatureLogFile(String temperatureLogFile) {
		this.temperatureLogFile = temperatureLogFile;
	}

	public String getTemperatureLogDate() {
		return temperatureLogDate;
	}

	public void setTemperatureLogDate(String temperatureLogDate) {
		this.temperatureLogDate = temperatureLogDate;
	}

	//toString
	@Override
	public String toString() {
		return "TemperatureLogVo [temperatureLogIdx=" + temperatureLogIdx + ", temperatureLogFile=" + temperatureLogFile
				+ ", temperatureLogDate=" + temperatureLogDate + "]";
	}




}//TemperatureLogVo 클래스 끝
