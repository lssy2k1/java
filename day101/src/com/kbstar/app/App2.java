package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.DAO;
import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;


public class App2 {

	public static void main(String[] args) {
		
		DAO<Integer, ItemDTO> itemDao = new ItemDAO();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command(q, i, d, u, s, sa)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("input id...(int값)");
				int id = sc.nextInt();
				System.out.println("input name...");
				String name = sc.next();
				System.out.println("input price...");
				double price = sc.nextDouble();
				System.out.println("input qt...");
				int qt = sc.nextInt();
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.insert(item);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("d")) {
				System.out.println("input id...(int값)");
				int id = sc.nextInt();
				try {
					itemDao.delete(id);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("u")) {
				System.out.println("input id...(int값)");
				int id = sc.nextInt();
				System.out.println("input name...");
				String name = sc.next();
				System.out.println("input price...");
				double price = sc.nextDouble();
				System.out.println("input qt...");
				int qt = sc.nextInt();
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.update(item);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("s")) {
				System.out.println("input id...(int값)");
				int id = sc.nextInt();
				ItemDTO item = null;
				try {
					item = itemDao.select(id);
					System.out.println(item);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("sa")) {
				List<ItemDTO> list = null;
				try {
					list = itemDao.select();
					for(ItemDTO u : list) {
						System.out.println(u);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		sc.close();
	}

}
