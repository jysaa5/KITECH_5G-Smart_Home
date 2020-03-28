package com.iot.smarthome.led.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.led.service.LedLogDetailViewService;

//LedLogDetailViewController: LED 로그를 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class LedLogDetailViewController {

	//객체 주입
	@Autowired
	LedLogDetailViewService logDetailViewService;
	
	//ledLogDetailView 메서드: 사용자가 LED 로그를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/led/ledLogDetailView")
	public String ledLogDetailView(@RequestParam(value = "ledLogIdx", defaultValue = "-1") int ledLogIdx, Model model) {
		
		model.addAttribute("ledLogDetailView", logDetailViewService.getLedLogDetailView(ledLogIdx));
		
		return "led/ledLogDetailView";
		
	}//ledLogDetailView 메서드 끝
	
}//LedLogDetailViewController 클래스 끝
