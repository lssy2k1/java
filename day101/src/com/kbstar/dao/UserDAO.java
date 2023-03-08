package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	//DB로 이용할 것!
	HashMap<String, UserDTO> db = null;
	
	public UserDAO() {
		db = new HashMap<>();
	}
	///////////////
	
	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())){
			throw new Exception("오류~ 이미 있는 아이디");//해당하는 아이디가 있으면 오류
		};
		db.put(v.getId(), v);
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception("오류~~ 없는 아이디라서 업데이트 불가");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("오류~~~ 없는 아이디라서 삭제 불가");//해당하는 아이디가 없으면 오류
		}
		db.remove(k);
		
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO user = null;
		user = db.get(k);
		return user;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		for(UserDTO u : col) {
			list.add(u);
		}
		return list;
	}

}
