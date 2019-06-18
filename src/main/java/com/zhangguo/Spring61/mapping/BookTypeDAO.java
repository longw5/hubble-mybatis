package com.zhangguo.Spring61.mapping;

import java.util.List;

import com.zhangguo.Spring61.entities.BookType;

/**
 * 图书类型数据访问接口
 *
 */
public interface BookTypeDAO {

	public List<BookType> getAllBookTypes();
	
	List<BookType> queryBookTypesBySql(int currPage, int pageSize);
	
	public int add(BookType entity);
	
	public int add100(String sql);
}
