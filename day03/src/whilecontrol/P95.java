package whilecontrol;

public class P95 {

	public static void main(String[] args) {
//		System.out.println("start ...");
//		int i = 1;
//		while (i <= 100) {//int i 의 사용범위가 for문과 다르다. while문에서 i는 while문 외에서도 사용 가능.
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("end ..."+i);//while이 100일때 증감연산이 한번 더 되어 101이 출력됨.
		
		
		//합과 평균을 구하세요(1-100까지)
		//짝수만
		
		System.out.println("start ...");
		int i = 1;
		int cnt = 0;
		int sum = 0;
		double avg = 0.0;
	
		while (i <= 10) {
			if (i%2 == 0) {
				sum += i;
				cnt++;
			}
			if(i == 8) {
				break;
			}
			i++;//i++문의 위치에 따라 결과값이 다름. 만약 if break문 위에 위치할 경우, 8일때는 sum에 더해지지 않고 끝남.
		
		}
		avg = (sum * 1.0) / cnt;
		

//		while (i <= 100) {
//			if (i % 2 != 0) {
//				i++;
//				//continue;
//			}
//			cnt++;
//			sum += i;
//			i++;
//		}	avg = (sum * 1.0) / cnt;

		System.out.printf("합 : %d, 평균 : %.2f\n", sum, avg);
		System.out.println("end ...");
	}

}
