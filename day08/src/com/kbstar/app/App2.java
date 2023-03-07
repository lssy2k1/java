package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;


public class App2 {

	public static void main(String[] args) {

		Service<Integer, ItemDTO> service = new ItemService();
		//ItemService service = new ItemService();
		SearchService search = new ItemService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command(q, i, d, u, s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if(cmd.equals("s")) {
				search.search();
			}else if(cmd.equals("i")) {
				System.out.println("input id...");
				int id = Integer.parseInt(sc.next());
				System.out.println("input name...");
				String name = sc.next();
				System.out.println("input price...");
				Double price = sc.nextDouble();
				System.out.println("input qt...");
				int qt = sc.nextInt();
				ItemDTO item = new ItemDTO(id, name, price, qt);
				service.register(item);
			}else if(cmd.equals("d")) {
				System.out.println("input id...");
				try {
					int id = sc.nextInt();
					service.remove(id);
				}catch(Exception e) {
					System.out.println("잘못입력했습니다.");
				}
				
			}else if(cmd.equals("u")) {
				System.out.println("input id...");
				int id = Integer.parseInt(sc.next());
				System.out.println("input name...");
				String name = sc.next();
				System.out.println("input price...");
				Double price = sc.nextDouble();
				System.out.println("input qt...");
				int qt = sc.nextInt();
				ItemDTO item = new ItemDTO(id, name, price, qt);
				service.modify(item);
			}
		}
		sc.close();
	}

}