package com.kbstar.dao;

import com.kbstar.frame.DAO;

public class AccountOracleDAO implements DAO {
//어카운트 정보를 입력받으면 AccountOracleDAO가 데이터베이스에 넣거나 수정하거나 삭제하는 역할을 함. 그걸 구현하는 것.
	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("inserted oracle...");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("deleted oracle...");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated oracle...");
	}

}
