package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserResgisterTest1 {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj1 = new UserDTO("id01", "pwd01", "james", "a@naver.com", "010-1111-1111");
		UserDTO obj2 = new UserDTO("id02", "pwd01", "james", "a@naver.com", "010-1111-1111");
		UserDTO obj3 = new UserDTO("id03", "pwd01", "james", "a@naver.com", "010-1111-1111");

		// register test---------------------------------------------------------
		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// register error test---------------------------------------------------------
//		try {
//			service.register(obj1);
//			System.out.println("=========================================");
//			service.register(obj2);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		}
		// get(k) test---------------------------------------------------------
		UserDTO user = null;
		try {
			user = service.get("id02");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// get() test---------------------------------------------------------
		List<UserDTO> list = null;
		try {
			list = service.get();
			for (UserDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//remove() test-------------------------------------------------------
		try {
			service.remove("id05");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
