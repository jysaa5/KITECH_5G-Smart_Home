package com.iot.smarthome.humidity.domain;

//HumidityLogWriteRequestVo: Humidity  로그 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class HumidityLogWriteRequestVo {
	
	//Humidity 로그 인덱스 번호
	private int humidityLogIdx;   
	//Humidity 로그 데이터(html)
	private String humidityLogFile;
	//Humidity 로그 데이터 저장 시간
	private String humidityLogDate;
	
	//<생성자>//
	//기본 생성자
	public HumidityLogWriteRequestVo() {
		super();
	}
	
	//생성자
	public HumidityLogWriteRequestVo(int humidityLogIdx, String humidityLogFile, String humidityLogDate) {
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
		return "HumidityLogWriteRequestVo [humidityLogIdx=" + humidityLogIdx + ", humidityLogFile=" + humidityLogFile
				+ ", humidityLogDate=" + humidityLogDate + "]";
	}

	//toFingerprintLog 메서드: HumidityLogVo 도메인의 객체를 반환하는 메서드
	public HumidityLogVo toHumidityLog() {
		
		return new HumidityLogVo(0, humidityLogFile, humidityLogDate);
	
	}//toHumidityLog 메서드 끝
	
}//HumidityLogWriteRequestVo 클래스 끝
