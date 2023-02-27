package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		Random r = new Random();
		
		for(int i = 0 ; i < arr.length ; i++) {
//			int data = r.nextInt(99) + 1;//1부터 99까지
//			arr[i] = data;	
			arr[i] = r.nextInt(99) + 1;//위의 두 줄을 한 줄로 쓸 수 있음
		}
		
		System.out.println(Arrays.toString(arr));//배열정보가 어떻게 들어가 있는지 확인하는 메소드
		
		for(int a : arr) {
			System.out.printf("%d\t", a);
		}
		
		//배열의 합과 평균을 구하시오
		int sum = 0;//초기화를 시키는 것
		double avg = 0.0;
		for(int a : arr) {
			sum += a;
		}
		avg = (sum * 1.0) / arr.length;
		System.out.printf("\nsum : %d, avg = %.2f", sum, avg);
	}

}
