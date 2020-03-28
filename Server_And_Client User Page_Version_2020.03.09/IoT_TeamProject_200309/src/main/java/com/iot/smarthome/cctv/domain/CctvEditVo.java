package com.iot.smarthome.cctv.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//CctvEditVo: 사진, 영상을 수정했을 때의 각각의 정보를 담는 도메인 클래스 
public class CctvEditVo {
	
	//cctv 인덱스 번호
	private int cctvIdx;  
	//cctv 사진: p, 영상: v
	private String cctvType;  
	//cctv 사진 또는 영상 제목
	private String cctvFile;  
	//cctv 사진 또는 영상 데이터
	private MultipartFile cctv;  
	//cctv 데이터 저장된 날짜, 시간
	private Date cctvOn; 

	//<생성자>//
	//기본 생성자
	public CctvEditVo() {
		super();
	}
	
	//생성자
	public CctvEditVo(int cctvIdx, String cctvType, String cctvFile, MultipartFile cctv, Date cctvOn) {
		super();
		this.cctvIdx = cctvIdx;
		this.cctvType = cctvType;
		this.cctvFile = cctvFile;
		this.cctv = cctv;
		this.cctvOn = cctvOn;
	}
	
	//getter와 setter
	public int getCctvIdx() {
		return cctvIdx;
	}

	public void setCctvIdx(int cctvIdx) {
		this.cctvIdx = cctvIdx;
	}

	public String getCctvType() {
		return cctvType;
	}

	public void setCctvType(String cctvType) {
		this.cctvType = cctvType;
	}

	public String getCctvFile() {
		return cctvFile;
	}

	public void setCctvFile(String cctvFile) {
		this.cctvFile = cctvFile;
	}

	public MultipartFile getCctv() {
		return cctv;
	}

	public void setCctv(MultipartFile cctv) {
		this.cctv = cctv;
	}

	public Date getCctvOn() {
		return cctvOn;
	}

	public void setCctvOn(Date cctvOn) {
		this.cctvOn = cctvOn;
	}

	//toString
	@Override
	public String toString() {
		return "CctvEditVo [cctvIdx=" + cctvIdx + ", cctvType=" + cctvType + ", cctvFile=" + cctvFile + ", cctv=" + cctv
				+ ", cctvOn=" + cctvOn + "]";
	}


	//getCctvWriteDate: 작성된 날짜를 숫자를 객체에 담아 반환하는 메서드
	//${writeDate} --> getWriteDate()
	//수정한 날짜를 가져오기 위해서 만듦.
	public java.util.Date getCctvWriteDate() {
		
		//getTime() 메서드: 1970년 1월 1일 0시 0분 0초부터 현재까지의 시간을 밀리초 단위로 환산한 값을 숫자로 반환한다.
		return new java.util.Date(cctvOn.getTime());
		
	}//getCctvWriteDate 메서드 끝
	
	
}//CctvEditVo 클래스 끝
