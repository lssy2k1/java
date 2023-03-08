package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.Makemessage;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;


public class App2 {

	public static void main(String[] args) {

		Service<Integer, ItemDTO> service = new ItemService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command(q, i, d, u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("input id...");
				int id = sc.nextInt();
				System.out.println("input name...");
				String name = sc.next();
				System.out.println("input price...");
				double price = sc.nextDouble();
				System.out.println("input qt...");
				int qt = sc.nextInt();
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					service.register(item);
				} catch (Exception e) {
					System.out.println(Makemessage.makeMessage(e.getMessage()));
				}
			}else if(cmd.equals("d")) {
				System.out.println("input id...");
				int id = sc.nextInt();
				try {
					service.remove(id);
				} catch (Exception e) {
					System.out.println(Makemessage.makeMessage(e.getMessage()));
				}
			}else if(cmd.equals("u")) {
				System.out.println("input id...");
				int id = sc.nextInt();
				System.out.println("input name...");
				String name = sc.next();
				System.out.println("input price...");
				double price = sc.nextDouble();
				System.out.println("input qt...");
				int qt = sc.nextInt();
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					service.modify(item);
				} catch (Exception e) {
					System.out.println(Makemessage.makeMessage(e.getMessage()));
				}
			}
		}
		sc.close();
	}

}
