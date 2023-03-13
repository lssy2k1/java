package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();

		Cust cust = new Cust("id77", "pwd20", "tom", 30);
//		try {
//			crudService.register(cust);
//			System.out.println("입력성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			crudService.modify(cust);
//			System.out.println("수정완료");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//
//		try {
//			crudService.remove("id002");
//			System.out.println("삭제성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		try {
//			System.out.println(crudService.get("id06"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		try {
			System.out.println(crudService.get());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
