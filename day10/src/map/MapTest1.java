package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

		Set<Integer> keys = map.keySet();
		System.out.println(keys.toString());
		
		for (int data :keys) {
			System.out.println(map.get(data));
		}
		
	}

}
