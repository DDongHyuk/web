package org.zerock.crazy.service;

import javax.servlet.http.HttpSession;


import org.zerock.crazy.model.CrazyMemberVO;



public interface CrazyLoginService {
   
	public String loginpros(CrazyMemberVO vo, HttpSession session)throws Exception;
	
}
