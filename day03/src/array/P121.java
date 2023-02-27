package array;

import java.util.Scanner;

public class P121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command[q, i, s]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Quit...");
				break;
			}else if (cmd.equals("i")) {
				System.out.println("Insert...");
				System.out.println("Input ID......");
				String id = sc.next();//입력된 데이터를 데이터베이스에 저장한다.
				System.out.println("Input PW......");
				String pw = sc.next();
				System.out.println("Input name......");
				String name = sc.next();
				System.out.printf("%s, %s, %s inserted...\n",id, pw, name);
			}else if (cmd.equals("s")) {
				System.out.println("Select...");
			}else {
				System.out.println("Invailid command...");
				System.out.println("Try again");

			}
		}//end while
		System.out.println("Bye");
		sc.close();
		
		//처음에 배웠던 부분을 복습한 것이지만,
		//이러한 코딩은 JAVA가 아니다. 안좋은 코딩임.
	}

}
