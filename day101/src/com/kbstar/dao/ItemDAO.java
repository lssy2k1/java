package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	HashMap<Integer, ItemDTO> db = new HashMap<Integer, ItemDTO>();
//	HashMap<Integer, ItemDTO> db = null;
//	public ItemDAO() {
//		db = new HashMap<>();
//	}
	
	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("같은 상품ID가 존재합니다");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception("입력하신 상품ID가 없습니다");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("입력하신 상품ID가 없습니다");
		}
		db.remove(k);
	}

	@Override
	public ItemDTO select(Integer k) throws Exception {
		ItemDTO result = null;
		if(!db.containsKey(k)) {
			throw new Exception("입력하신 상품ID가 없습니다");
		}
		result = db.get(k);
		return result;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Collection<ItemDTO> col = db.values();
		if (col.size() == 0) {
			throw new Exception("등록된 자료가 없습니다.");
		}
		for (ItemDTO i : col) {
			list.add(i);
		}
		return list;
	}

}
