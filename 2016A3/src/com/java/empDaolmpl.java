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
	List<emp> list=new ArrayList<emp>();//����list���ϣ����ڱ���User����
	try {
	Connection conn=DBUtil.getConnection();//ͨ��������ֱ�ӵ���getConnection������ȡjdbc���ӡ�
	String sql="select * from emp";
	PreparedStatement ps=conn.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
	emp user=new emp();//����User�������ڱ��ִ����ݿ������������
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
