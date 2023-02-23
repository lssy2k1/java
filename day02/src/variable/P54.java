package variable;

public class P54 {
//ctrl space : 자동완성
	public static void main(String[] args) {
		//boolean
		boolean b1 = true;
		boolean b2 = 10 > 5;
		
		//정수
		int n1 = 10;
			//long n2 = 200000000000;
			//정수의 기본형은 int. 오른쪽은 int. 따라서 오류.
		long n2 = 200000000000L;
			//long n2 = 0L; n2 = 2222222222L;
			//(데이터베이스에서 카운트 된 것을 받아올 것)
		
		//실수
		double d1 = 1.0;
			//float f1 = 1.0;
			//실수의 기본형은 double. 따라서 오류.
		float f1 = 1.0f;
		double d2 = 1/2;
			//0.5가 안나와? 정수끼리 연산한 1/2는 int로 계산이 된다.
		System.out.println(d2);
		
		double d3 = 10.0/3.0;
		System.out.println(d3);
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);
		//double보다는 짧다. 그리고 오른쪽 연산에도 F를 붙여줘야 함.

		//char
		char c1 = 'A';
		System.out.println(c1);
			//c1이 메모리에 들어갈 땐 65로 들어감.
		char c2 = 65;//알파벳 대문자 A는 65. 국제표준임.
		System.out.println(c2);
		
		int n3 = 10;
		double n4 = 10.0;
			//int result = n3 + n4;
			//n4가 double이라서 오류. 또한 n4를 int로 바꾸기엔 리스크가 있음.
		double result2 = n3 + n4;//왜 노랗게 떠? -> 변수를 선언하고 안써서!
	}

}
