package com.iot.smarthome.styler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.styler.domain.StylerListViewVo;
import com.iot.smarthome.styler.service.StylerListService;

//StylerListController: 사진 리스트를 페이지 번호에 따라서 보여지게 하는 컨트롤러
@Controller
public class StylerListController {

	//객체 주입
	@Autowired
	StylerListService listService;
	
	//list 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/styler/stylerList")
	public String listStyler(@RequestParam(value="page", defaultValue = "1") int page, Model model) {
		
		//페이지 번호를 받아서 처리
		StylerListViewVo view = listService.getStylerListView(page); 
		
		System.out.println(view);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("stylerListView",view);
		
		return "styler/stylerList";
		
	}//listStyler 메서드 끝
	
}//StylerListController 클래스 끝
