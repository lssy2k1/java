package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {
		int temp[] = new int[5];
		int arr[][] = new int[5][5];

		Random r = new Random();
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[i].length; j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println("");
	}
		System.out.println("------------------------------");
		//위의 내용을 for-each로 변경하시오
		
		for (int[] a : arr) {//arr에서 끄집어 내는 것은 int의 배열이다! 따라서 int[] a로 요소를 받는다.
			for (int b : a) {//위에서 끄집어낸 배열 a에서 받는 것은 int다. 따라서 b
				System.out.printf("%d\t", b);//출력은 a에서 끄집어낸 b를 순차적으로 끄집어 내는 것이므로 b만 출력.
			}
			System.out.println("");
		}

	}
}