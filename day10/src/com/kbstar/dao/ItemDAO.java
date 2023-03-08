package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO <Integer, ItemDTO> {

	@Override
	public void insert(ItemDTO v) throws Exception {
		if (v.getId() == 1010) {
			throw new Exception("ER1001");
		}
		System.out.println(v.getId()+ "inserted...");

	}
	@Override
	public void delete(Integer k) throws Exception {
		if (k == 1010) {
			throw new Exception("ER1002");
		}
		System.out.println(k+ "deleted...");	
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if (v.getId() == 1010) {
			throw new Exception("ER1003");
		}
		System.out.println(v.getId()+ "updated...");
		
	}



}
