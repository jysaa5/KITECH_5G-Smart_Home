package com.iot.smarthome.cctv.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//CctvDetailViewVo: 사진이나 영상을 자세히 보기 위해 저장되어 있던 데이터를 담는 도메인 클래스
public class CctvDetailViewVo {

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
	public CctvDetailViewVo() {
		super();
	}

	//생성자
	public CctvDetailViewVo(int cctvIdx, String cctvType, String cctvFile, MultipartFile cctv, Date cctvOn) {
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
		return "CctvDetailViewVo [cctvIdx=" + cctvIdx + ", cctvType=" + cctvType + ", cctvFile=" + cctvFile + ", cctv="
				+ cctv + ", cctvOn=" + cctvOn + "]";
	}
	
}//CctvDetailViewVo 클래스 끝
