package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하십시오(10~100)");
		String cmd = sc.next();
		//10~100사이의 정수를 입력 받는다.
		//1투어 입력 받은 숫자 까지의 범위에서 랜덤한 숫자를 발생하시오.
		
		int cmd2 = Integer.valueOf(cmd);
		Random r = new Random();
		int rndNum = r.nextInt(cmd2)+1; 
		System.out.println(rndNum);
		

		sc.close();//OS에 파이프가 꽃혀있는 상태에서 close를 통해 잘 닫아줘야한다.
	}

}
