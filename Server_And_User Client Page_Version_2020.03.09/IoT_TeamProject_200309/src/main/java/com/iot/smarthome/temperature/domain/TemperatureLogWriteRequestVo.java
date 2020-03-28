package com.iot.smarthome.temperature.domain;

//TemperatureLogWriteRequestVo: temperature  로그 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class TemperatureLogWriteRequestVo {
	
	//temperature 로그 인덱스 번호
	private int temperatureLogIdx;   
	//temperature 로그 데이터(html)
	private String temperatureLogFile;
	//temperature 로그 데이터 저장 시간
	private String temperatureLogDate;
	
	//<생성자>//
	//기본 생성자
	public TemperatureLogWriteRequestVo() {
		super();
	}

	//생성자
	public TemperatureLogWriteRequestVo(int temperatureLogIdx, String temperatureLogFile, String temperatureLogDate) {
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
		return "TemperatureLogWriteRequestVo [temperatureLogIdx=" + temperatureLogIdx + ", temperatureLogFile="
				+ temperatureLogFile + ", temperatureLogDate=" + temperatureLogDate + "]";
	}

	//toTemperatureLog 메서드: TemperatureLogVo 도메인의 객체를 반환하는 메서드
	public TemperatureLogVo toTemperatureLog() {
		
		return new TemperatureLogVo(0, temperatureLogFile, temperatureLogDate);
	
	}//toTemperatureLog 메서드 끝
	
}//TemperatureLogWriteRequestVo 클래스 끝
