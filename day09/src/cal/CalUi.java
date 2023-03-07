package cal;

import java.util.Scanner;

public class CalUi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		double result;
		//try catch 없이 throws Exception을 선언하는 것만으로 예외처리가 가능한지 확인하였지만 불가능.
//		result = Cal.div(a, b);
//		System.out.println(result);

		
		try {
			result = Cal.div(a, b);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 못나눔");
			//e.printStackTrace();
		}
//		System.out.println(result);
		sc.close();
	}

}
