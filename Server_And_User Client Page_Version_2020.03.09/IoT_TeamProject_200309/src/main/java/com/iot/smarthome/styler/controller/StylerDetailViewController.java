package com.iot.smarthome.styler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.styler.service.StylerDetailViewService;

//StylerDetailViewController: 사진 리스트를 자세히 보여주는 페이지로 이동하게 하는 컨트롤러
@Controller
public class StylerDetailViewController {

	//객체 주입
	@Autowired
	StylerDetailViewService detailViewService;
	
	//detailStylerView 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/styler/stylerDetailView")
	public String detailStylerView(@RequestParam(value = "stylerIdx", defaultValue = "-1") int stylerIdx, Model model) {
		
		model.addAttribute("stylerDetailView", detailViewService.getDetailStyleridx(stylerIdx));
		
		return "styler/stylerDetailView";
		
	}//detailStylerView 메서드 끝
	
}//StylerDetailViewController 클래스 끝
