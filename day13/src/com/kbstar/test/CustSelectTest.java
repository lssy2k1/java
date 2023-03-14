package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();

		Cust cust = null;
		try {
			System.out.println(crudService.get("id77"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		List<Cust> list = null;
//		try {
//			list = crudService.get();
//			if (list.size() == 0) {
//				System.out.println("데이터가 없습니다.");
//				return;// 더이상 for문 진행하지마.
//			} else {
//				for (Cust obj : list) {
//					System.out.println(obj);
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

	}

}
