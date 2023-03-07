package bank;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		while (true) {
			System.out.println("input command(q, c, s, d, w, g)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if (cmd.equals("c")) {
				System.out.println("accNum를 입력하세요");
				String accNum = sc.next();
				System.out.println("name를 입력하세요");
				String name = sc.next();
				System.out.println("accHolder를 입력하세요");
				String accHolder = sc.next();
				System.out.println("balance를 입력하세요");
				double balance = sc.nextDouble();
				try {
					acc = new Account(accNum, name, accHolder, balance);
					System.out.println(acc);
				} catch (MinusException e) {
					System.out.println("입력하신 금액이 음수입니다.");
					//e.printStackTrace();
				}
			}else if (cmd.equals("s")) {
				System.out.println(acc);
			}else if (cmd.equals("d")) {
				System.out.println("금액을 입력하세요");
				double money = sc.nextDouble();
				try {
					acc.deposit(money);
				} catch (MinusException e) {
					System.out.println("입력하신 금액이 음수입니다.");
					//e.printStackTrace();
				}
			}else if (cmd.equals("w")) {
				System.out.println("금액을 입력하세요");
				double money = sc.nextDouble();
				try {
					acc.withdraw(money);
				} catch (MinusException e1) {
					System.out.println("입력하신 금액이 음수입니다.");
					//e1.printStackTrace();
				} catch (EnoughException e2) {
					System.out.println("잔액이 부족합니다.");
					//e2.printStackTrace();

				}
			}else if (cmd.equals("g")) {
				System.out.println(acc.getBalance());
			}

		}
		sc.close();

	}
}