package org.zerock.crazy.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.zerock.crazy.dao.CrazyLoginDAO;
import org.zerock.crazy.model.CrazyMemberVO;

@Service
public class CrazyLoginServiceIpml implements CrazyLoginService {

	@Inject
	CrazyLoginDAO dao;
	
	@Override
	public String loginpros(CrazyMemberVO vo, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		
		String status = dao.loginpros(vo);
		if(status==null) {
			return null;
		}else {
			
			session.setAttribute("status", status);
			session.setAttribute("status", vo.getUserid());
			return status;	
		}
		
	}

}
