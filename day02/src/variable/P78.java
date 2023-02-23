package variable;

public class P78 {

	public static void main(String[] args) {
		int a = 10;
		//a = a + 1;//a + 1 이라는 연산 부분을 만났을 때, CPU가 돌아가기 시작하고 2진수로 변환하여 연산하고 값을 돌려줌.
		a = --a + 1;//(a - 1) + 1 과 같은 연산이지만 증감 연산자가 더 빠르게 진행이 된다.
		System.out.println(a);
		
		int b = 20;
		b += 1;
		//b = b + 1;
		
	}

}
