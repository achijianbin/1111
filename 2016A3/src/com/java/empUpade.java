package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class empUpade {
	private PreparedStatement stmt;
	public int upade() throws SQLException {

		Connection conn=DBUtil.getConnection();//通过工具类直接调用getConnection方法获取jdbc连接。
		stmt=conn.prepareStatement("insert into emp(id) values(?)");
		stmt.setString(1, "1234");

		
		
return stmt.executeUpdate();

	
}
}
	
