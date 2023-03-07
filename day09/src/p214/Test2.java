package p214;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int num = 0;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("input num...");
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		//sc.close();
		//자체적으로 try(sc) catch구문 안에서 sc를 사용하게 되면, try-catch를 빠져나올 때 sc가 close됨
		//sc가 close가 안되는 경우가 있다. 위 방법으로 사용하면 close시 문제는 처리방법이 없다.
		//따라서 finally를 사용하여 구문 내 sc.close가 비정상 종료시 오류코드를 나오게 할 수 있다.
		System.out.println("End Application");
	}

}
