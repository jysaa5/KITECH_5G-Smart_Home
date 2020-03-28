package com.iot.smarthome.cctv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.cctv.service.CctvDetailViewService;

//CctvDetailViewController: CCTV 화면 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class CctvDetailViewController {

	//객체 주입
	@Autowired
	CctvDetailViewService detailViewService;
	
	//cctvDetailView 메서드: 사용자가 CCTV를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/cctv/cctvDetailView")
	public String cctvDetailView(@RequestParam(value = "cctvIdx", defaultValue = "-1") int cctvIdx, Model model) {
		
		model.addAttribute("cctvDetailView", detailViewService.getCctvDetailViewIdx(cctvIdx));
		
		return "cctv/cctvDetailView";
		
	}//cctvDetailView 메서드 끝
	
}//CctvDetailViewController 클래스 끝
