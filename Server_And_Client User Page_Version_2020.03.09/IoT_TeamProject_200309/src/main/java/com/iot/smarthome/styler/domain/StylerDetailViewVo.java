package com.iot.smarthome.styler.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//StylerDetailViewVo: 사진을 자세히 보여주기 위해 저장되어 있던 데이터를 담는 도메인 클래스
public class StylerDetailViewVo {

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
	public StylerDetailViewVo() {
		super();
	}

	//생성자
	public StylerDetailViewVo(int stylerIdx, String stylerUser, String stylerPhoto, MultipartFile photo,
			Date stylerOn) {
		super();
		this.stylerIdx = stylerIdx;
		this.stylerUser = stylerUser;
		this.stylerPhoto = stylerPhoto;
		this.photo = photo;
		this.stylerOn = stylerOn;
	}

	//getter, setter
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

	
	//toString
	@Override
	public String toString() {
		return "StylerDetailViewVo [stylerIdx=" + stylerIdx + ", stylerUser=" + stylerUser + ", stylerPhoto="
				+ stylerPhoto + ", photo=" + photo + ", stylerOn=" + stylerOn + "]";
	}
	
}//StylerDetailViewVo 클래스 끝
