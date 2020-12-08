package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
		private static final String URL="jdbc:mysql://localhost:3306/workdb?serverTimezone=UTC&useSSL=true";//数据库名称为servlet
		private static final String USER="root";
		private static final String PASSWORD="jianbin";
		private static Connection conn=null;
		static{
		try {
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//创建连接
		conn=DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {

		e.printStackTrace();
		} catch (SQLException e) {

		e.printStackTrace();
		}
		}
		public static Connection getConnection(){

		return conn;
		}

		}

