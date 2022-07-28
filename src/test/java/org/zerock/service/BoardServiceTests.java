package org.zerock.service;

import static org.junit.Assert.assertNotNull;

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
public class BoardServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	
	/*@Test
	public void testExist() {
		
		log.info(service);
		assertNotNull(service);
		
	}*/
	
	
	/*@Test
	public void testRegister() {
		
		BoardVO board = new BoardVO();
		board.setTitle("보드서비스 제목1");
		board.setContent("보드서비스 내용1");
		board.setWriter("보드서비스 작가1");
		
		service.register(board);
		log.info("생성된 게시물의 번호 : " + board.getBno());
		
	}*/
	
	
	/*@Test
	public void testGetList() {
		
		service.getList().forEach(board -> log.info(board));
		
	}*/
	
	
	/*@Test
	public void testGet() {
		
		log.info(service.get(123L));
		
	}*/
	
	
	/*@Test
	public void testDelete() {
		
		log.info("REMOVE RESULT : " + service.remove(1L));
		
	}*/
	
	
	@Test
	public void testUpdate() {
		
		BoardVO board = service.get(2L);
		
		if(board==null) {
			
			return;
			
		}
		
		board.setTitle("보드셋타1");
		log.info("MODIFY RESUTLT : " + service.modify(board));
		
	}
	
}
