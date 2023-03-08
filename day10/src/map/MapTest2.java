package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		//앞에 있는 게 프라이머리 키, 뒤에는 값
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("d"));
		
		System.out.println(map.get(1));
		
		Set<Integer> keys = map.keySet();//keySet()의 반환형태는 Set, key값은 Integer이므로 이렇게 받음
		
		System.out.println(keys.toString());
		for (int data :keys) {
			System.out.println(map.get(data));//map에서 i번째 데이터 꺼내줄래?
		}
		
	}

}
