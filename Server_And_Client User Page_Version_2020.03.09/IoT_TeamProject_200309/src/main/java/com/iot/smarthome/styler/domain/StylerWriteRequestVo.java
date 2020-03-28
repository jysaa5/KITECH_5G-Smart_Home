package com.iot.smarthome.styler.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//StylerWriteRequestVo: 사진 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class StylerWriteRequestVo {
	
	//사진 인덱스 번호
	private int stylerIdx;
	//사용자 이름
	private String stylerUser;
	//사진 데이터
	private MultipartFile photo;
	//사진 저장 날짜
	private Date stylerOn;
	
	
	//<생성자>//
	//기본 생성자
	public StylerWriteRequestVo() {
		super();
	}

	//전체 필드를 받는 생성자
	public StylerWriteRequestVo(int stylerIdx, String stylerUser, MultipartFile photo, Date stylerOn) {
		super();
		this.stylerIdx = stylerIdx;
		this.stylerUser = stylerUser;
		this.photo = photo;
		this.stylerOn = stylerOn;
	}

    //get와 set 메서드
	public int getStylerIdx() {
		return stylerIdx;
	}

	public void setStylerIdx(int stylerIdx) {
		this.stylerIdx = stylerIdx;
	}

	public String getStylerUser() {
		return stylerUser;
	}

	public void setStylerUser(String stylerUser) {
		this.stylerUser = stylerUser;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public Date getStylerOn() {
		return stylerOn;
	}

	public void setStylerOn(Date stylerOn) {
		this.stylerOn = stylerOn;
	}
	
	//toString
	@Override
	public String toString() {
		return "StylerWriteRequestVo [stylerIdx=" + stylerIdx + ", stylerUser=" + stylerUser + ", photo=" + photo + ", stylerOn=" + stylerOn + "]";
	}

	
	
	//toStyler 메서드: Styler 도메인의 객체를 반환하는 메서드
	public StylerVo toStyler() {
		
		return new StylerVo(0, stylerUser, null, photo, null);
	
	}//toStyler 메서드 끝
	
	
}//StylerWriteRequestVo 클래스 끝
