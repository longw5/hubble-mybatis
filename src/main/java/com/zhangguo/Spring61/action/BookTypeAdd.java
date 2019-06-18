package com.zhangguo.Spring61.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.zhangguo.Spring61.entities.BookType;
import com.zhangguo.Spring61.service.BookTypeService;

@WebServlet("/BookTypeAdd.do")
public class BookTypeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 BookTypeService bookTypeService;
	 
	@Override
	public void init() throws ServletException {
	  //从容器中获得bean
	  bookTypeService=CtxUtil.getBean(BookTypeService.class);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sql = "insert into hive.test.booktypes values(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss'),(1, 'sss')";
		
		int add100 = bookTypeService.add100(sql);
		
		System.out.println(add100);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
