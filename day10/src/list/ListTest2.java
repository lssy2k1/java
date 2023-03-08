package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();//인터페이스 사용법!
		//List<Integer> list = new ArrayList<Integer>();
		//ArrayList<Integer> list = new ArrayList<Integer>();//인터페이스 사용 안할거다! 하면 이렇게 해도 됨.
		// List list = new List는 안돼. List는 인터페이스이므로 객체생성이 안됨.
		// 하위클래스인 ArrayList를 호출해서 쓴다.

		// 1~10까지의 숫자를 20개 입력한다.
		// 단 while 문을 이용한다.

		while (list.size() < 20) {
			Random r = new Random();
			int num = (r.nextInt(10) + 1);
			list.add(num);
		}
		System.out.println(list.size());
		System.out.println("------------------------------------");
		for (int data : list) {
			System.out.println(data);
		}

	}
}