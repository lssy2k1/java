package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO <String, UserDTO>{
	//여기는 비즈니스 로직은 전혀 들어가지 않는다(회원가입시 ㅇㅇ를 체크하고 메일을 보내고 등)
	//오직 데이터베이스 처리관련 명령어만 들어간다.
	
	HashMap<String, UserDTO> db;
	public UserDAO() {
		db = new HashMap<>();
	}
	
	
	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {//실제 데이터베이스에서는 자동으로 걸러줌.
			throw new Exception("DB ERROR 이미 존재하는 아이디입니다.");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("DB ERROR 존재하지 않는 아이디입니다.");
		}
		db.remove(k);
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception("DB ERROR 존재하지 않는 아이디입니다.");
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public UserDTO select(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("DB ERROR 존재하지 않는 아이디입니다.");
		}
		UserDTO obj = null;//유저정보를 데이터베이스에서 가져온다. 유저정보 객체를 만든다.
		obj = db.get(k);
		return obj;
		
	}

	@Override
	public List<UserDTO> select() throws Exception {
		if (db == null) {
			throw new Exception("DB ERROR 등록된 정보가 없습니다.");
		}
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		for (UserDTO obj : col) {
			list.add(obj);
		}
		
		return list;
	}


	@Override
	public List<UserDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
