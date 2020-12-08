package com.java;

import java.util.List;

public class empService {
	public List<emp> getListAll(){
		empDao userDao = new empDaolmpl();
		List list = userDao.getListAll();
		return list;
		}

}
