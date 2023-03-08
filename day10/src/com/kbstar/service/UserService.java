package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO>{

	DAO<String, UserDTO> dao = new UserDAO();

	@Override
	public void register(UserDTO v) throws Exception {
		System.out.println("security check...");
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("send mail...");
		System.out.println("send SMS...");
	}

	
	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			//log
			throw e;
		}
		System.out.println("send mail...");
	}

	@Override
	public void modify(UserDTO v) throws Exception{
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("send mail...");
	}

}
