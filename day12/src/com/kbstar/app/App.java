package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> 
		service = new BankServiceImpl();
//		CRUDService<String, UserDTO> userService =
//				new UserService();
		
		while(true) {
			UserDTO user = null;
			System.out.println("Login(l), Resgister(r), quit(q)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("종료합니다.");
				break;
			}else if (cmd.equals("r")) {
				System.out.println("register... input id, pw, name, email, sms");
				String id = sc.next();
				String pw = sc.next();
				String name = sc.next();
				String email = sc.next();
				String contact = sc.next();//정보를 입력 받는다.
				user = new UserDTO(id, pw, name, email, contact);//받은 정보를 UserDTO로 객체생성한다.
				//여기서 생성하는 userDTO는 if문 안에서만 사용이 가능. 블럭 안에 갇힌 코딩은 좋지 않다.
				try {
					service.register(user);
					System.out.println("가입을 환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if (cmd.equals("l")) {
				System.out.println("login...input id, pw");
				String id = sc.next();
				String pw = sc.next();
				user = null;//login을 하면 얻어지는 UserDTO 받을 준비
				try {
					user = service.login(id, pw);//service에다가 id, pw를 넘겨주면 로그인이 된다.
					System.out.println("로그인 성공");
					System.out.println(user);
					System.out.println("======================================");
					while(true) {
						System.out.println("Menu(m, t, a, i, tr, e)...");
						String cmd2 = sc.next();
						if(cmd2.equals("e")) {
							break;//두번째 와일문 빠져나감.
						}else if (cmd2.equals("m")){
							System.out.println("Make Account...");
							double balance = Double.parseDouble(sc.next());
							service.makeAccount(user.getId(), balance);
							//while문 처음에 user를 선언하지 않으면 처음 while 내 if문에서만 사용가능하므로 주의!
							System.out.println("계좌개설이 완료되었습니다.");
							
						}else if (cmd2.equals("t")){
							System.out.println("Transaction...input myacc, youacc, balance, desc");
							String sendAcc = sc.next();
							String receiveAcc = sc.next();
							double balance = sc.nextDouble();
							String desc = sc.next();
							service.transaction(sendAcc, receiveAcc, balance, desc);
							System.out.println("이체가 완료되었습니다.");

						}else if (cmd2.equals("a")){
							System.out.println("Select Account...input Id");
							List<AccountDTO> list = null;
							list = service.getAllAccount(user.getId());
							for (AccountDTO acc : list) {
								System.out.println(acc);
							}
						}else if (cmd2.equals("i")){
							System.out.println("user info...");
							String id1 = sc.next();
							UserDTO user1 = service.getUserInfo(id1);
							System.out.println(user1);
//							UserDTO user1 = userService.get(id1);
//							System.out.println(user1);//userService에도 get함수가 있으나 현재는 db를 따로쓰고 있어서 안됨...
							
						}else if (cmd2.equals("tr")){
							System.out.println("select transaction...input Account");
							String accNo = sc.next();
							List<TransactionDTO> list = null;
							list = service.getAllTr(accNo);
							for (TransactionDTO tr : list) {
								System.out.println(tr);
							}
							
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		sc.close();
	}

}
