package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;


public class App {

	public static void main(String[] args) {

		Service<String, UserDTO> service = new UserService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command(q, i, d, u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("input id...");
				String id = sc.next();
				System.out.println("input pw...");
				String pw = sc.next();
				System.out.println("input name...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pw, name);//DTO는 내용들을 객체로 만들어서 한번에 전달함.
				service.register(user);
			}else if(cmd.equals("d")) {//primary key를 입력받아서 해당하는 사용자의 정보를 삭제시킴
				System.out.println("input id...");
				String id = sc.next();
				service.remove(id);
			}else if(cmd.equals("u")) {//원하는 정보를 수정하려면, 원하는 정보만 전송하는 게 아니라 모든 정보를 수정요청 전송하게 됨.
				System.out.println("input id...");
				String id = sc.next();
				System.out.println("input pw...");
				String pw = sc.next();
				System.out.println("input name...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pw, name);
				service.modify(user);
			}
		}
		sc.close();
	}

}

//public class App {
//	
//	public static void main(String[] args) {
//		Service<String, UserDTO> service = new UserService();
//		//UserService를 준비하고 데이터가 들어오면 register
//		UserDTO user = new UserDTO("lss", "pwd1", "jons");
//		service.register(user);
//	}
//	
//}
