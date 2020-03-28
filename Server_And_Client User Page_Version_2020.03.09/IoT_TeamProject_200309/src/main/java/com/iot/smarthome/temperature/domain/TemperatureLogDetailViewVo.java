package com.iot.smarthome.temperature.domain;

//TemperatureLogDetailViewVo: temperature 로그를 자세히 보여주기 위해 데이터를 담는 Vo
public class TemperatureLogDetailViewVo {

	//temperature 로그 인덱스 번호
	private int temperatureLogIdx;   
	//temperature 로그 데이터(html)
	private String temperatureLogFile;
	//temperature 로그 데이터 저장 시간
	private String temperatureLogDate;
	
	//기본 생성자
	public TemperatureLogDetailViewVo() {
		super();
	}

	//생성자
	public TemperatureLogDetailViewVo(int temperatureLogIdx, String temperatureLogFile, String temperatureLogDate) {
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
		return "TemperatureLogDetailViewVo [temperatureLogIdx=" + temperatureLogIdx + ", temperatureLogFile="
				+ temperatureLogFile + ", temperatureLogDate=" + temperatureLogDate + "]";
	}


	
}//TemperatureLogDetailViewVo 클래스 끝
