package com.iot.smarthome.humidity.domain;

//HumidityLogDetailViewVo: Humidity 로그를 자세히 보여주기 위해 데이터를 담는 Vo
public class HumidityLogDetailViewVo {

	//humidity 로그 인덱스 번호
	private int humidityLogIdx;   
	//humidity 로그 데이터(html)
	private String humidityLogFile;
	//humidity 로그 데이터 저장 시간
	private String humidityLogDate;
	
	//기본 생성자
	public HumidityLogDetailViewVo() {
		super();
	}

	//생성자
	public HumidityLogDetailViewVo(int humidityLogIdx, String humidityLogFile, String humidityLogDate) {
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
		return "HumidityLogDetailViewVo [humidityLogIdx=" + humidityLogIdx + ", humidityLogFile=" + humidityLogFile
				+ ", humidityLogDate=" + humidityLogDate + "]";
	}

	
}//HumidityLogDetailViewVo 클래스 끝
