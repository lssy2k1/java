package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO>{

	HashMap<String, AccountDTO> db;
	
	public AccountDAO() {
		db = new HashMap<>();
	}
	
	@Override
	public void insert(AccountDTO v) throws Exception {
		if(db.containsKey(v.getAccNum())) {
			throw new Exception("같은 계좌가 존재합니다.");
		}
		db.put(v.getAccNum(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("입력하신 계좌는 없는 계좌입니다.");
		}
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		if(!db.containsKey(v.getAccNum())) {
			throw new Exception("입력하신 계좌는 없는 계좌입니다.");
		}
		db.put(v.getAccNum(), v);
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("입력하신 계좌는 없는 계좌입니다.");
		}
		AccountDTO obj= null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		if(db == null) {
			throw new Exception("보유중인 계좌가 없습니다.");
		}
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col;
		col = db.values();
		for (AccountDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

	//사용자의 계좌 조회
	//obj : 사용자의 id
	//Object obj = new String();
	
	@Override
	public List<AccountDTO> search(Object obj) throws Exception {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		
		for (AccountDTO acc : col) {
			//계좌 중에서 id가 obj와 같은 것들만
			if ((acc.getHolder().equals(obj))) {
			list.add(acc);
			}
		}
		
		return list;
	}



}
