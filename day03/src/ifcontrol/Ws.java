package ifcontrol;

public class Ws {

	public static void main(String[] args) {
//		1-100까지의 숫자 중
//		1. 3의 배수의 합과 평균을 구하시오
//		2. 4의 배수의 합과 평균을 구하시오
//		3. 7의 배수의 합과 평균을 구하시오

		int cnt3 = 0;
		int sum3 = 0;
		double avg3 = 0.0;
		int cnt4 = 0;
		int sum4 = 0;
		double avg4 = 0.0;
		int cnt7 = 0;
		int sum7 = 0;
		double avg7 = 0.0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				cnt3++;
				sum3 += i;
			}
			if (i % 4 == 0) {
				cnt4++;
				sum4 += i;
			}
			if (i % 7 == 0) {
				cnt7++;
				sum7 += i;
			}
		}
		
		
		
		avg3 = (sum3 * 1.0) / cnt3;
		avg4 = (sum4 * 1.0) / cnt4;
		avg7 = (sum7 * 1.0) / cnt7;
		System.out.printf("%d, %.2f, %d, %.2f, %d, %.2f", sum3, avg3, sum4, avg4, sum7, avg7);
	}
	
}
