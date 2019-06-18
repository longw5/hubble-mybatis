package com.zhangguo.Spring61.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangguo.Spring61.entities.BookType;
import com.zhangguo.Spring61.mapping.BookTypeDAO;

/*
 * 图书类型服务
 */
@Service
public class BookTypeService {

	@Resource
	BookTypeDAO bookTypeDAO;

	public List<BookType> getAllBookTypes() {
		return bookTypeDAO.getAllBookTypes();
	}
	
	public List<BookType> queryBookTypesBySql(int currPage, int pageSize) {
		return bookTypeDAO.queryBookTypesBySql(currPage, pageSize);
	}
	
	@Transactional
	public int addDouble(BookType entity1,BookType entity2){
		int rows=0;
		rows+=bookTypeDAO.add(entity1);
		rows+=bookTypeDAO.add(entity2);
		return rows;
	}
	
	@Transactional
	public int add100(String sql){
		int rows = bookTypeDAO.add100(sql);
		return rows;
	}
}
