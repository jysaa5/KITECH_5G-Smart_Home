package com.iot.smarthome.cctv.service;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iot.smarthome.cctv.dao.CctvDao;
import com.iot.smarthome.cctv.domain.CctvVo;
import com.iot.smarthome.cctv.domain.CctvWriteRequestVo;

//서비스 bean으로 등록하기 
//CctvWriteService: 사진, 영상을 작성하는 sql을 실행하는 서비스 클래스
@Service("cctvWriteService")
public class CctvWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private CctvDao dao;
	
	//writeCctv 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int writeCctv(HttpServletRequest request, CctvWriteRequestVo write) {
	
		dao = template.getMapper(CctvDao.class);
		
		// 서버 경로
		String path = "/uploadfile/usercctv"; // 리소스 매핑 필요
		
		// 절대 경로
		String dir = request.getSession().getServletContext().getRealPath(path);

		CctvVo cctv = write.toCctv();
		
		
		int resultCnt = 0;

		String newFileName = "";
		String type = write.getCctvType();
		

		MultipartFile file = write.getCctv();
		
		try {
			if (file != null && !file.isEmpty() && file.getSize() > 0) {
				// 새로운 파일 이름 생성
				// String newFileName = memberInfo.getuId()+System.nanoTime();
				//newFileName = styler.getStylerUser() + "_" + file.getOriginalFilename();
				newFileName = file.getOriginalFilename();
				
				// 파일을 서버의 지정 경로에 저장
				file.transferTo(new File(dir, newFileName));
				
				// 데이터베이스 저장을 하기위한 파일 이름 set
				cctv.setCctvFile(newFileName);
				
			} else {
				
				if(type.equals("p"))
					{
					cctv.setCctvFile("default.png");
					}else if(type.equals("v")) {
					cctv.setCctvFile("default.mp4");
					}
			}
		
		resultCnt = dao.insertCctv(cctv);
		
		} catch (IllegalStateException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("오류");
			if (file != null) {
				
				new File(dir, newFileName).delete();
				
			}
		}

		return resultCnt;
		
	}//writeCctv메서드 끝
	
}//CctvWriteService 클래스 끝
