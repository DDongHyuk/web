package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("select sysdate from dual")
	public String getTime();
	
	public String getTime2();//이건 xml과 연결할 것
	
}
