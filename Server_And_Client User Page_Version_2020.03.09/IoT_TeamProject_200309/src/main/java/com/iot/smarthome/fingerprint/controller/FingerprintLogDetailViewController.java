package com.iot.smarthome.fingerprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.fingerprint.service.FingerprintLogDetailViewService;


//FingerprintLogDetailViewController: fingerprint 로그를 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class FingerprintLogDetailViewController {

	//객체 주입
	@Autowired
	FingerprintLogDetailViewService logDetailViewService;
	
	//fingerprintLogDetailView 메서드: 사용자가 CCTV 로그를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/fingerprint/fingerprintLogDetailView")
	public String fingerprintLogDetailView(@RequestParam(value = "fingerprintLogIdx", defaultValue = "-1") int fingerprintLogIdx, Model model) {
		
		model.addAttribute("fingerprintLogDetailView", logDetailViewService.getFingerprintLogDetailView(fingerprintLogIdx));
		
		return "fingerprint/fingerprintLogDetailView";
		
	}//fingerprintLogDetailView 메서드 끝
	
}//FingerprintLogDetailViewController 클래스 끝
