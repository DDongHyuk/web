package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	/*@Test
	public void testGetList() {
		
		mapper.getList().forEach(board -> log.info(board));
		
	}*/
	
	
	/*@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("복습작성글1");
		board.setContent("복습작성내용1");
		board.setWriter("복습작성자1");
		
		mapper.insert(board);
		log.info(board);
		
	}*/
	
	
	
	/*@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("복습 select key 1");
		board.setContent("복습s elect key 내용1");
		board.setWriter("복습 select key 작성자1");
		
		mapper.insertSelectKey(board);
		log.info(board);
		
	}*/
	
	
	/*@Test
	public void testRead() {
		
		BoardVO board = mapper.read(2L);
		log.info(board);
		
	}*/
	
	/*@Test
	public void testDelete() {
		
		log.info("DELETE COUNT : " + mapper.delete(122L));
		
	}*/
	
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		
		board.setBno(2L);
		board.setTitle("수정복습1");
		board.setContent("수정복습내용1");
		board.setWriter("수정복습유저1");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT : " + count);
		
	}
	
}
