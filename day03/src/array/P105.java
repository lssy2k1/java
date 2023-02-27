package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];//프로그래밍은 요소 하나 수정이 된다고 다른것이 작동이 안해서는 안된다.
							   //배열을 10->5로 바꿔도 정상작동해야함. ex)arr.length가 10 이라고 10으로 해버리면 안됨.
		
		Random r = new Random();
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = r.nextInt(99) + 1;//위의 두 줄을 한 줄로 쓸 수 있음
		}
		
		System.out.println(Arrays.toString(arr));//배열정보가 어떻게 들어가 있는지 확인하는 메소드

		//배열의 합과 평균을 구하시오
		//홀수번째 합과 평균을 구하시오
		
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		double avg = 0.0;
		double avg2 = 0.0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			if(i%2 == 0) {//홀수번째이기 때문에 i%2가 1인 경우를 생각하지만
						  //index는 0부터 시작하기 때문에 i%2 ==0인 경우가 홀수번째다.
				sum2 += arr[i];
				cnt++;
			}
		}
		avg = (sum * 1.0) / arr.length;
		avg2 = (sum * 1.0) / cnt;
		System.out.printf("%d, %.2f, %d, %.2f", sum, avg, sum2, avg2);
	}

}
