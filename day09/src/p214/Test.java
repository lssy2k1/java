package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input num...");
		int num = 0;// try구문 내에 넣으면 try catch구문 밖에서는 인식 불가.
		try {// 이러한 구문에서 예외가 발생할 수 있다.
			num = Integer.parseInt(sc.next());// 여기서 예외가 발생하면 아래 행들 건너뛰고 catch로 감.
			int result = 10 / num;
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("분모가 0입니다.");
			//return;//더이상 아래 코드들을 실행하지 않고 함수를 종료시킴.
			// e1.printStackTrace();//어디서 에러가 발생했는지 개발자가 볼 수 있게 해주는 명령어
		} catch (NumberFormatException e2) {
			System.out.println("숫자를 입력하세요.");
			//return;
		} finally {
			System.out.println("반드시 실행");
			sc.close();
		}

		System.out.println("End Application");
	}

}
