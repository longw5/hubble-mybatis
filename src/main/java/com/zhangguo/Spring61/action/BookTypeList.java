package com.zhangguo.Spring61.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

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

@WebServlet("/BookTypeList.do")
public class BookTypeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 BookTypeService bookTypeService;
	 
	@Override
	public void init() throws ServletException {
	  //在当前上下文中获得Spring容器
	  WebApplicationContext ctx=WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	  //从容器中获得bean
	  bookTypeService=ctx.getBean(BookTypeService.class);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		
		System.out.println("--------------doGet BookTypeList---------------------");
		
		List<BookType> allBookTypes = bookTypeService.getAllBookTypes();
		
		for (BookType bookType : allBookTypes) {
			System.out.println(bookType);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
