package com.iot.smarthome.styler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.styler.service.StylerRecommendationService;

//StylerRecommendationController: 사진 추천 페이지를 보여주는 컨트롤러
@Controller
public class StylerRecommendationController {

	//객체 주입
	@Autowired
	StylerRecommendationService recommendationService;
	
	//recommendationStyler 메서드: 사용자가 추천 버튼을 눌렀을 때, 실행되는 메서드
	@RequestMapping("/styler/recommendation")
	public String recommendationStyler(@RequestParam(value = "stylerIdx", defaultValue = "-1") int stylerIdx, Model model) {
		
		model.addAttribute("stylerRecommendationView", recommendationService.getRecommendationStyler(stylerIdx));
		
		return "styler/recommendation";
		
	}//recommendationStyler 메서드 끝
	
}//StylerRecommendationController 클래스 끝
