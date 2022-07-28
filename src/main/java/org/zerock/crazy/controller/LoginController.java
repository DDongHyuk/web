package org.zerock.crazy.controller;



import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.crazy.model.CrazyMemberVO;
import org.zerock.crazy.service.CrazyLoginService;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/member/*")
public class LoginController {
   
	@Inject
	CrazyLoginService service;
	
	@RequestMapping(value="/login.do")
	public String loginview() {
		return "member/login";
	}
	
	@RequestMapping(value="/loginpros.do" , method=RequestMethod.POST)
	public ModelAndView loginpros(@ModelAttribute CrazyMemberVO vo, HttpSession session) throws Exception {
	     String status = service.loginpros(vo, session);
	     ModelAndView mav = new ModelAndView();
	     
	   //로그인 실패
	     if(status==null) {
	     System.out.print("로그인실패");
	     mav.setViewName("login");
	     mav.addObject("msg","error");
	     
	   //사용자 
	     }else if(status.equals("1")) {
	    	  mav.setViewName("main");
	     
	   //관리자
	     }else {
	       mav.setViewName("home");
	       
	     }
	     return mav;
	}
	
	@RequestMapping("/memberjoin")
	public void memberjoin() {
	
	}
}
