package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		//1~10까지 숫자 10개를 입력하세요.
		
//		for(int i = 0; i < 10; i++) {
//		Random r = new Random();
//		int num = r.nextInt(10) + 1;
//		set.add(num);//중복은 제외됨.
//		}
//		System.out.println(set.size());
//		System.out.println("------------------");

		while(set.size() < 10) {
			Random r = new Random();
			int num = r.nextInt(10) + 1;
			set.add(num);
		}
		System.out.println(set.size());
		System.out.println("------------------");
		for(int data : set) {
			System.out.println(data);
		}
	}

}
