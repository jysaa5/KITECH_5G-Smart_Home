package com.iot.smarthome.styler.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//StylerVo: 사진 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class StylerVo {
	
	//사진 인덱스 번호
	private int stylerIdx;
	//사용자 이름
	private String stylerUser;
	//사진 제목
	private String stylerPhoto;
	//사진 데이터
	private MultipartFile photo;
	//사진 저장 날짜
	private Date stylerOn;
	
	//<생성자>//
	//기본 생성자
	public StylerVo() {
		super();
	}
	
	//전체 필드를 다 받는 생성자
	public StylerVo(int stylerIdx, String stylerUser, String stylerPhoto, MultipartFile photo, Date stylerOn) {
		super();
		this.stylerIdx = stylerIdx;
		this.stylerUser = stylerUser;
		this.stylerPhoto = stylerPhoto;
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

	public String getStylerPhoto() {
		return stylerPhoto;
	}

	public void setStylerPhoto(String stylerPhoto) {
		this.stylerPhoto = stylerPhoto;
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

	
	//toString 메서드
	@Override
	public String toString() {
		return "StylerVo [stylerIdx=" + stylerIdx + ", stylerUser=" + stylerUser + ", stylerPhoto=" + stylerPhoto
				+ ", photo=" + photo + ", stylerOn=" + stylerOn + "]";
	}
	

}//StylerVo 클래스 끝
