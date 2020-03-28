package com.iot.smarthome.temperature.domain;

//TemperatureLogEditVo: temperature 로그 데이터 수정시 데이터를 담는 클래스
public class TemperatureLogEditVo {

	
	//temperature 로그 인덱스 번호
	private int temperatureLogIdx;   
	//temperature 로그 데이터(html)
	private String temperatureLogFile;
	//temperature 로그 데이터 저장 시간
	private String temperatureLogDate;
	
	
	//기본생성자
	public TemperatureLogEditVo() {
		super();
	}
	
	//생성자
	public TemperatureLogEditVo(int temperatureLogIdx, String temperatureLogFile, String temperatureLogDate) {
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
		return "TemperatureLogEditVo [temperatureLogIdx=" + temperatureLogIdx + ", temperatureLogFile="
				+ temperatureLogFile + ", temperatureLogDate=" + temperatureLogDate + "]";
	}

}//TemperatureLogEditVo 클래스 끝
