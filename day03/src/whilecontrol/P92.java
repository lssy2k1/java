package whilecontrol;

public class P92 {

	public static void main(String[] args) {

//		System.out.println("start ...");
//		int cnt = 0;
//		for (int i = 1; i <= 100; i++) {//int i 의 사용범위가 while문과 다르다. for문안에서 선언된 int i는 for문 내에서만!
//			System.out.println(i);//실행하고 증가시킴! i++
//			cnt++;
//		}
//		System.out.println("end ..."+cnt);
		
		
		//합과 평균을 구하시오
		System.out.println("start ...");
	
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		for (int i = 0 ; i <= 103 ; i++) {
			sum += i;
			cnt++;
		}
		//avg = (double)sum / cnt ;
		avg = sum / (cnt * 1.0);//가장 안전하게 처리하는 방법. 괄호를 없애면 int int먼저 계산됨 
		System.out.printf("%d, %.2f\n", sum, avg);
		
		System.out.println("end ...");

		
	}

}
