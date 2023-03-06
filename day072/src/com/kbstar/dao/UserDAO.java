package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{
	//정보가 들어오면 데이터베이스에 입력 수정 삭제하는 역할
	//Service에서 선언한 제네릭의 타입을 정해주는 건 DAO 여기서 한다.
	
	@Override
	public void insert(UserDTO v) {
		System.out.println(v.getId()+"님이 저장되었습니다");
		//제네릭을 안쓰고 기존처럼 Object obj로 했을 경우 .getId를 사용할 수 없다.
		//하지만 제네릭을 쓰고 타입을 UserDTO를 받음으로써 .getId가 사용 가능.
	}

	@Override
	public void delete(String k) {
		System.out.println(k+"님이 삭제되었습니다");

	}

	@Override
	public void update(UserDTO v) {
		System.out.println(v.getId()+"님이 수정되었습니다");	
	}



}
