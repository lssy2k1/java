package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();//제네릭<> 당신은 리스트에 무슨 타입을 담을건가요? 프리미티브타입은 못적어
		//List list = new ArrayList(); 도 가능하나, 모든 타입을 다 담을 수 있음.
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(10) + 1;
			//r.nextInt를 바로 list.add()괄호에 넣으려고 했는데 오류남.
			list.add(num);
		}
		list.add(0, 999);//list의 0번째 인덱스에 999를 넣겠다.
		list.remove(0);

		//		list.add(10);//프리미티브타입 10을 객체타입 Integer에 넣을수가 있나요? 허용합니다.
//		list.add(20);
//		list.add(30);
		for (int data : list) {//Integer 타입으로 넣었지만, int로 꺼내서 넣을 수 있다!
			System.out.println(data);
		}
	}
	
}
