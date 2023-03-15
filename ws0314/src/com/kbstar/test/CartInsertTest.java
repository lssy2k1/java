package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {

		CRUDService<String, Cart> crudService = new CartCRUDServiceImpl();
		
		Cart cart = new Cart("00011", "00011", 3);
		try {
			crudService.register(cart);
			System.out.println("등록완료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
