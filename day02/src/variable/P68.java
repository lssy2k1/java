package variable;

import java.util.Random;

//java.lang 외의 패키지를 사용할 때, class의 위 package의 아래 import 해줘야 함.
//import 없이 Random을 쓰면 빨간줄이 그어지고 커서를 올리면 import할래? 나옴
//ctrl shift o로 import 가능.
//ctrl shift f 자동정렬.

public class P68 {

	public static void main(String[] args) {
		//String s1 = 10;//타입을 바꾸라고 함.
		String s1 = "10";
		int s2 = Integer.parseInt(s1);
		int a = 10;
		
		System.out.println(s1+10);
		System.out.println(s2+a);//s1을 형변환하여 s2에 넣어 계산.
			//string과 일반타입을 더하면 오른쪽 식을 강제로 string으로 바꿈.
		//System.out.println(s1-10);//안돼. +만 concat으로 인식
		
		int n1 = 10;
		String n2 = String.valueOf(n1);//parseInt나 valueOf는 API. 잘 이용하자!
									   //어떤 API인지는 드래그하고 f3 또는 자바 사전
									   //java.lang API말고 다른 API는 import필요.
		//String n2 = n1;//안돼
		//String n2 = n1+"";//string을 더하면 string이 된다.
		
		Random r = new Random();
		int rndNum = r.nextInt(10)+1;//0-9까지 10은 미포함, +1하면 1-10까지
		System.out.println(rndNum);
	}

}
