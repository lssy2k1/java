package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO>{

	DAO<String, UserDTO> dao = new UserDAO();
	//나는 DAO에다 String과 UserDTO를 이렇게 선언해서 사용하겠다.
	//service도 DAO를 통해서 Database에 접근하므로 선언해줌.
	
	@Override
	public void register(UserDTO v) {
		System.out.println("security check...");
		dao.insert(v);	//DB에 넣어줌.
		System.out.println("send mail...");//실제는 메일보내는 로직을 여기다 넣음.
		System.out.println("send SMS...");
	}
	//모든게 한번에 일어나야한다? -> 트랜젝션.
	//중간에 문제가 발생했다? DB에 넣었던걸 원상복구한 것을 롤백이라 한다.
	//비즈니스로직이 여기에 추가돼. 메일 어떻게 보내요? -> 로직추가, SMS 어떻게 보내요? -> 로직추가.
	//dao역할은 데이터베이스에 넣는 역할만 한다! 그래서 dao영역과 service영역을 나눔.
	
	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("send mail...");
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
		System.out.println("send mail...");
	}

}
