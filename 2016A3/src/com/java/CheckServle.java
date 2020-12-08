package com.java;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.util.StringUtils;


public class CheckServle extends HttpServlet {

	@Override

		
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户列表
		empUpade empu = new empUpade();
		try {
			empu.upade();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		empService userService=new empService();//创建UserService对象，
		List list=userService.getListAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("list129.jsp").forward(request, response);//跳转到success.jsp页面

		}

		
	

	}
	



	


