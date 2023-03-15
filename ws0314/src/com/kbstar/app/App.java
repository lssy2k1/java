package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.CustCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class App {

	public static void main(String[] args) {

		ShopService<Cust, Cart> shopService = new ShopServiceImpl();
		CRUDService<String, Cust> custService = new CustCRUDServiceImpl();
		CRUDService<String, Item> itemService = new ItemCRUDServiceImpl();
		CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----   Shop Mall Program -----");
			System.out.println("Login(l) or Register(r) (q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye...");

				break;
			}else if(cmd.equals("r")) {
				System.out.println("Register.. ");
				System.out.println("id.. ");
				String id = sc.next();
				System.out.println("pwd.. ");
				String pwd = sc.next();
				System.out.println("name.. ");
				String name = sc.next();
				Cust cust = new Cust(id, pwd, name, 20);				
				try {
					shopService.register(cust);
					System.out.println("환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("l")) {
				System.out.println("Login.. ");
				System.out.println("ID를 입력 하세요.. ");
				String id = sc.next();
				System.out.println("PWD를 입력 하세요.. ");
				String pwd = sc.next();
				Cust cust = null;//login성공시 cust정보를 유지하면서 가야하기 때문.
				try {
					cust = shopService.login(id, pwd);
					
					System.out.println("로그인 성공");
					System.out.println("----------------------------");
					while(true) {
						System.out.println("Menu(사용자정보조회(c),상품조회(it),카트입력(i),나의카트조회(ci),나가기(e))...");
						String cmn = sc.next();
						if(cmn.equals("e")) {
							System.out.println("Logout...");
							break;
						}else if(cmn.equals("c")) {
							System.out.println("사용자정보조회...");
							Cust custInfo = null;
							custInfo = custService.get(cust.getId());
							System.out.println(custInfo);
						}else if(cmn.equals("it")) {
							System.out.println("상품조회");
							List<Item> list = null;
							list = itemService.get();
							for (Item item : list) {
								System.out.println(item);
							}
						}else if(cmn.equals("i")) {
							System.out.println("카트입력");
							Cart cart = null;
							System.out.println("item");
							//System.out.println(itemService.get());//상품목록 보여주기
							String item = sc.next();
							System.out.println("cnt");
							int cnt = sc.nextInt();
							cart = new Cart(cust.getId(), item, cnt);
							cartService.register(cart);
							System.out.printf("cart에 %s가 %d개 추가됨.\n",item, cnt);
						}else if(cmn.equals("ci")) {
							System.out.println("나의카트조회...");
							List<Cart> list = null;
							list = shopService.myCart(id);
							for (Cart cart : list) {
								System.out.println(cart);
							}
							
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					//e.printStackTrace();
				}
			}
		}
		sc.close();
	}

}