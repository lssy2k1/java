package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Random r = new Random();
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = r.nextInt(99) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
	
		//배열의 합과 평균을 구하시오
		//배열에 홀수의 값들의 합과 평균을 구하시오
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i]%2 == 0) {
				continue;
			}
			sum += arr[i];
			cnt++;
		}
		avg = (sum * 1.0) / cnt;
		System.out.printf("%d, %.2f", sum, avg);
	}

}
