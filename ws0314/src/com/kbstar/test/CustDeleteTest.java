package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustDeleteTest {

	public static void main(String[] args) {
		
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();

		try {
			crudService.remove("id002");
			System.out.println("삭제성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
