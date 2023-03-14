package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();

		Cust cust = new Cust("id98", "pwd99", "anderson", 70);

		try {
			crudService.register(cust);
			System.out.println("입력성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

//		Cust cust = new Cust("id17", "pwd17", "tom17", 30);
//		
//		try {
//			crudService.modify(cust);
//			System.out.println("수정완료");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}


	}

}
