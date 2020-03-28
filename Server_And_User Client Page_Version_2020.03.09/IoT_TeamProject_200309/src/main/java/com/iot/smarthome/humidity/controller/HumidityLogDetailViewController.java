package com.iot.smarthome.humidity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.humidity.service.HumidityLogDetailViewService;

//HumidityLogDetailViewController: humidity 로그를 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class HumidityLogDetailViewController {

	//객체 주입
	@Autowired
	HumidityLogDetailViewService logDetailViewService;
	
	//humidityLogDetailView 메서드: 사용자가 CCTV 로그를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/humidity/humidityLogDetailView")
	public String humidityLogDetailView(@RequestParam(value = "humidityLogIdx", defaultValue = "-1") int humidityLogIdx, Model model) {
		
		model.addAttribute("humidityLogDetailView", logDetailViewService.getHumidityLogDetailView(humidityLogIdx));
		
		return "humidity/humidityLogDetailView";
		
	}//humidityLogDetailView 메서드 끝
	
}//HumidityLogDetailViewController 클래스 끝
