package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTest1 {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> accService;
		accService = new AccountService();
		
		AccountDTO obj1 = new AccountDTO("790801", 30000, "khlee");
		AccountDTO obj2 = new AccountDTO("831801", 50000, "wwlee");
		AccountDTO obj3 = new AccountDTO("790802", 60000, "aslee");
		
		//register test--------------------------------------------------------
		try {
			accService.register(obj1);
			accService.register(obj2);
			accService.register(obj3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		//remove test--------------------------------------------------------
//
//		try {
//			accService.remove("831801");
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
		
		//modify test--------------------------------------------------------
		try {
			//obj2.getAccNum() = "393939";//수정해보려했는데 안돼
			accService.modify(obj2);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
//		//get(k) test--------------------------------------------------------
//		try {
//			accService.get("790801");
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
		
		//get() test--------------------------------------------------------

		try {
			System.out.println(accService.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
