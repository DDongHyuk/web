package org.zerock.crazy.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;
import org.zerock.crazy.model.CrazyMemberVO;


@Repository
public class CrazyLoginDAOImpl implements CrazyLoginDAO {
     
	
	@Inject
	SqlSession session;
	
	@Override
	public String loginpros(CrazyMemberVO vo) throws Exception {
		      //carzy가 네임 스페이스  logincheck가 아이디
		return session.selectOne("crazy.logincheck",vo);
	}

	
}