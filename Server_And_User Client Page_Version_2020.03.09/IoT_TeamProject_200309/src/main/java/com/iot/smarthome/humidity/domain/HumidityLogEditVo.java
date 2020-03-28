package com.iot.smarthome.humidity.domain;

//HumidityLogEditVo: Humidity 로그 데이터 수정시 데이터를 담는 클래스
public class HumidityLogEditVo {

	
	//Humidity 로그 인덱스 번호
	private int humidityLogIdx;   
	//Humidity 로그 데이터(html)
	private String humidityLogFile;
	//Humidity 로그 데이터 저장 시간
	private String humidityLogDate;
	
	
	//기본생성자
	public HumidityLogEditVo() {
		super();
	}
	
	//생성자
	public HumidityLogEditVo(int humidityLogIdx, String humidityLogFile, String humidityLogDate) {
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
		return "HumidityLogEditVo [humidityLogIdx=" + humidityLogIdx + ", humidityLogFile=" + humidityLogFile
				+ ", humidityLogDate=" + humidityLogDate + "]";
	}
	

}//HumidityLogEditVo 클래스 끝
