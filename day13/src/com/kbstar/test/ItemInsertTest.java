package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service = new ItemCRUDServiceImpl();

		Item obj = new Item("glasses", 300000, 9.2);// 여기서 3개만 입력하면, service단에서 계좌 만들도록.
		try {
			service.register(obj);
			System.out.println("입력성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
