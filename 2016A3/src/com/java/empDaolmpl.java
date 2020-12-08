package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class empDaolmpl implements empDao {

	@Override
	public List<emp> getListAll() {
	List<emp> list=new ArrayList<emp>();//创建list集合，用于保持User对象
	try {
	Connection conn=DBUtil.getConnection();//通过工具类直接调用getConnection方法获取jdbc连接。
	String sql="select * from emp";
	PreparedStatement ps=conn.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
	emp user=new emp();//创建User对象用于保持从数据看查出来的数据
	user.setId(rs.getInt(1));
	user.setEmpname(rs.getString(2));
	user.setEmpno(rs.getString(3));
	user.setJob(rs.getString(4));
	list.add(user);
	}
	} catch (SQLException e) {

	e.printStackTrace();
	}
	return list;
	}

}
