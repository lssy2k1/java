package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();

		// Register
		UserDTO user = new UserDTO("id01", "0101", "jaems", "a@naver.com", "01000000000");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Login
		String id = "id01";
		String pwd = "0101";//화면으로 입력받지만 그냥 테스트라서 적음.
		UserDTO loginUser = null;//로그인했을 때 받을값 확인하고 받을 준비.
		try {
			loginUser = service.login(id, pwd);
			System.out.println(loginUser);
			System.out.println("login OK!!!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
