package com.iot.smarthome.cctv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.cctv.service.CctvLogDetailViewService;


//CctvLogDetailViewController: CCTV로그를 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class CctvLogDetailViewController {

	//객체 주입
	@Autowired
	CctvLogDetailViewService logDetailViewService;
	
	//cctvLogDetailView 메서드: 사용자가 CCTV 로그를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/cctv/cctvLogDetailView")
	public String cctvLogDetailView(@RequestParam(value = "cctvLogIdx", defaultValue = "-1") int cctvLogIdx, Model model) {
		
		model.addAttribute("cctvLogDetailView", logDetailViewService.getCctvLogDetailView(cctvLogIdx));
		
		return "cctv/cctvLogDetailView";
		
	}//cctvLogDetailView 메서드 끝
	
}//CctvLogDetailViewController 클래스 끝
