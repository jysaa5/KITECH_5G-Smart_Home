package com.iot.smarthome.cctv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.cctv.domain.CctvListViewVo;
import com.iot.smarthome.cctv.service.CctvListService;

//CctvListController: CCTV로 저장된 사진, 동영상 저장한 리스트
@Controller
public class CctvListController {

	//객체 주입
	@Autowired
	CctvListService listService;
	
	//cctvList 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	//Model에 저장
	@RequestMapping("/cctv/cctvList")
	public String cctvList(@RequestParam(value="page", defaultValue = "1") int page, Model model) {
		
		//페이지 번호를 받아서 처리
		CctvListViewVo view = listService.getCctvListCount(page); 
		
		System.out.println(view);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("cctvListView",view);
		
		return "cctv/cctvList";
		
	}//cctvList 메서드 끝
	
}//CctvListController 클래스 끝
