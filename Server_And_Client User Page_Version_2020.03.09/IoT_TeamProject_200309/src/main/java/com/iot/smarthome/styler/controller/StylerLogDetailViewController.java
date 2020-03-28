package com.iot.smarthome.styler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.styler.service.StylerLogDetailViewService;

//StylerLogDetailViewController: Styler 로그를 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class StylerLogDetailViewController {

	//객체 주입
	@Autowired
	StylerLogDetailViewService logDetailViewService;
	
	//humidityLogDetailView 메서드: 사용자가 CCTV 로그를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/styler/stylerLogDetailView")
	public String stylerLogDetailView(@RequestParam(value = "stylerLogIdx", defaultValue = "-1") int stylerLogIdx, Model model) {
		
		model.addAttribute("stylerLogDetailView", logDetailViewService.getStylerLogDetailView(stylerLogIdx));
		
		return "styler/stylerLogDetailView";
		
	}//stylerLogDetailView 메서드 끝
	
}//StylerLogDetailViewController 클래스 끝
