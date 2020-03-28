package com.iot.smarthome.humidity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.humidity.domain.HumidityLogListViewVo;
import com.iot.smarthome.humidity.service.HumidityLogListService;

//HumidityLogListController: humidity 로그가 저장된 리스트
@Controller
public class HumidityLogListController {

	//객체 주입
	@Autowired
	HumidityLogListService listService;
	
	//humidityLogList 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	//Model에 저장
	@RequestMapping("/humidity/humidityLogList")
	public String humidityLogList(@RequestParam(value="page", defaultValue = "1") int page, Model model) {
		
		//페이지 번호를 받아서 처리
		HumidityLogListViewVo view = listService.getHumidityLogListCount(page); 
		
		System.out.println(view);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("humidityLogListView",view);
		
		return "humidity/humidityLogList";
		
	}//humidityLogList 메서드 끝
	
}//HumidityLogListController 클래스 끝
