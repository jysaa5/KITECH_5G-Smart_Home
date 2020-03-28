package com.iot.smarthome.cctv.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//CctvWriteRequestVo: 사진 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class CctvWriteRequestVo {
	
	//cctv 인덱스 번호
	private int cctvIdx; 
	//cctv 사진: p, 영상: v
	private String cctvType;
	//cctv 사진 또는 영상 데이터
	private MultipartFile cctv;  
	//cctv 데이터 저장된 날짜, 시간
	private Date cctvOn; 
	
	//<생성자>//
	//기본 생성자
	public CctvWriteRequestVo() {
		super();
	}
	
	//생성자
	public CctvWriteRequestVo(int cctvIdx, String cctvType, MultipartFile cctv, Date cctvOn) {
		super();
		this.cctvIdx = cctvIdx;
		this.cctvType = cctvType;
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
		return "CctvWriteRequestVo [cctvIdx=" + cctvIdx + ", cctvType=" + cctvType + ", cctv=" + cctv + ", cctvOn="
				+ cctvOn + "]";
	}

	//toCctv 메서드: cctv 도메인의 객체를 반환하는 메서드
	public CctvVo toCctv() {
		
		return new CctvVo(0, cctvType, null, cctv, null);
	
	}//toCctv 메서드 끝
	
}//CctvWriteRequestVo 클래스 끝
