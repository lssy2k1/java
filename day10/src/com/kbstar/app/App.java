package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Makemessage;
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
				UserDTO user = new UserDTO(id, pw, name);
				try {
					service.register(user);
				} catch (Exception e) {
					System.out.println(Makemessage.makeMessage(e.getMessage()));
				}
			}else if(cmd.equals("d")) {
				System.out.println("input id...");
				String id = sc.next();
				try {
					service.remove(id);
				} catch (Exception e) {
					System.out.println(Makemessage.makeMessage(e.getMessage()));
				}
			}else if(cmd.equals("u")) {
				System.out.println("input id...");
				String id = sc.next();
				System.out.println("input pw...");
				String pw = sc.next();
				System.out.println("input name...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pw, name);
				try {
					service.modify(user);
				} catch (Exception e) {
					System.out.println(Makemessage.makeMessage(e.getMessage()));
				}
			}
		}
		sc.close();
	}

}
