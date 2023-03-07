package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {

	DAO<Integer, ItemDTO> dao;
	// SMS 보내는 기능이 있다면 이 부분에서 SMS보내는 기능을 설정을 하게 된다.

	public ItemService() {
		dao = new ItemDAO();
		// 상위클래스 DAO에 하위클래스 ItemDAO(DAO를 임플리먼트함)를 담을 수 있다.
		// database가 mysql로 바뀌었다 하게되면 dao를 다른 DB프로그램으로 지정을 하면 수정 끝.
	}

	@Override
	public void register(ItemDTO v) {
		System.out.println(v + "Data Check...");
		dao.insert(v);
		System.out.println("Send SMS");

	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + "Data Check...");
		dao.delete(k);
		System.out.println("Send SMS");
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v + "Data Check...");
		dao.update(v);
		System.out.println("Send SMS");
	}

	@Override
	public void search() {
		System.out.println("Item Search...");
	}

}
