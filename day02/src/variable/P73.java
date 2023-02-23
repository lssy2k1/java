package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력 하시오(q,i,d,s)");
		String cmd = sc.next();
		System.out.printf("%s를 입력했습니다", cmd);
		sc.close();//OS에 파이프가 꽃혀있는 상태에서 close를 통해 잘 닫아줘야한다. 안닫으면 OS과부하로 죽음.
	}

}
