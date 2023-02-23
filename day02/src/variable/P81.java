package variable;

import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
			//int num = Integer.parseInt(sc.next()); //이렇게도 받을 수 있다.
		System.out.printf("%d를 입력하였습니다\n", num);
		String result = (num > 0) ? "정상" : "비정상";
		System.out.println(result);
		sc.close();
	}

}
