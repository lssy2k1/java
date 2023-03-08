package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>{

	DAO<Integer, ItemDTO> dao = new ItemDAO();
	
	@Override
	public void register(ItemDTO v) throws Exception {
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println(v.getId() + "registered...");
	}

	@Override
	public void remove(Integer k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		}
		System.out.println(k + "removed...");
	}

	@Override
	public void modify(ItemDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e){
			throw e;
		}
		System.out.println(v.getId() + "modified...");
	}

}
