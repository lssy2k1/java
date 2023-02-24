package whilecontrol;

public class P94 {

	public static void main(String[] args) {

//		System.out.println("start ...");
//		int cnt = 0;
//		for (int i = 1; i <= 100; i++) {//int i 의 사용범위가 while문과 다르다. for문안에서 선언된 int i는 for문 내에서만!
//			System.out.println(i);//실행하고 증가시킴! i++
//			cnt++;
//		}
//		System.out.println("end ..."+cnt);

		// 합과 평균을 구하시오
		// 짝수만 구하시오
		// i%2 == 0
		System.out.println("start ...");

//방법1
		int cnt = 0;
		int sum = 0;
		double avg = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 != 0) {
//				continue;//홀수일 때는 for문을 다시 돌리고 홀수가 아닐 경우에만 연산.
//						 //이런 방법은 for문 안의 if 괄호를 짧게 빠져나오게 할 수 있다.
//			}
//			sum += i;
//			cnt++;
//		}

//방법2		
//		for (int i = 0 ; i <= 100 ; i++) {
//			if(i%2 == 0) {
//				sum += i;
//				cnt++;
//			}
//		}

//방법3		
//		for (int i = 0 ; i <= 100 ; i+=2) {
//			sum += i;
//			cnt++;
//		}
		
		
		for (int i = 0 ; i <= 10 ; i++) {
		if(i%2 == 0) {
			sum += i;
			cnt++;
		}
		if(i == 8) {
			break;//8이 되면 for문을 그만해라
		}
	}
		
		avg = sum / (cnt * 1.0);
		System.out.printf("%d, %.2f\n", sum, avg);

		System.out.println("end ...");

	}

}
