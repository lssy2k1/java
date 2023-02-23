package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		//a++;//a+1보다 빠르게 진행이 된다.(증감연산자)
		//++b;
		//System.out.printf("%d, %d\n", a,b);
		
		int result = ++a + b++;//b는 이 라인이 끝나고 나서 11로 변경됨. 현재까지는 10.
		System.out.printf("%d, %d\n", a,b);//11, 11 출력
		System.out.println(result);//21 출력

		System.out.println( 5 == 5);
		
		int aa = 10;
		int bb = 10;
		
		System.out.println( (aa++ >= 0) || (bb++ >= 0));
		//|| 또한 or인데 앞부분이 참이기 때문에 뒤에는 연산을 안한다.
		//| 은 둘다 연산은 완료한다. 일반적으로 ||으로 쓰지만 뒷값을 반드시 증가시켜줘야할 경우 |를 쓴다.
		System.out.printf("%d, %d\n", aa,bb);

	}

}
