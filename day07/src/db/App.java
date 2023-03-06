package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//OracleDAO가 구현이 안됐는데 APP개발은 어떻게 해?
		//interface DAO를 바라보고 개발하게 됨.(기능정의가 된 것만을 바라보고 개발함)
		//추상클래스 및 인터페이스는 객체생성을 할 수가 없다.
		DAO dao = new OracleDAO();
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
				dao.insert(user);
			}else if(cmd.equals("d")) {//primary key를 입력받아서 해당하는 사용자의 정보를 삭제시킴
				System.out.println("input id...");
				String id = sc.next();
				dao.delete(id);
			}else if(cmd.equals("u")) {//원하는 정보를 수정하려면, 원하는 정보만 전송하는 게 아니라 모든 정보를 수정요청 전송하게 됨.
				System.out.println("input id...");
				String id = sc.next();
				System.out.println("input pw...");
				String pw = sc.next();
				System.out.println("input name...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pw, name);
				dao.update(user);
			}
		}
		sc.close();
	}

}
