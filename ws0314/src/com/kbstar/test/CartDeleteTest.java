package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartDeleteTest {

	public static void main(String[] args) {

		CRUDService<String, Cart> crudService = new CartCRUDServiceImpl();

		try {
			crudService.remove("jun");
			System.out.println("제거완료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
