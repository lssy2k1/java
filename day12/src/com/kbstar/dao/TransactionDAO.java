package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO> {

	HashMap<String, TransactionDTO> db;

	public TransactionDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(TransactionDTO v) throws Exception {
		if (db.containsKey(v.getDate())) {
			throw new Exception("같은 거래내역이 존재합니다.");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public void delete(String k) throws Exception {
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("입력하신 계좌는 없는 계좌입니다.");
		}
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		if (db == null) {
			throw new Exception("보유중인 계좌가 없습니다.");
		}
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col;
		col = db.values();
		for (TransactionDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

	// 고객이 보유하고 있는 계좌번호를 입력 하면
	// 해당 계좌읙 거래 내역을 조회 한다.
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();

		for (TransactionDTO tr : col) {
			// 계좌 중에서 id가 obj와 같은 것들만
			if ((tr.getAccNo().equals(obj))) {
				list.add(tr);
			}
		}

		return list;

	}
}
