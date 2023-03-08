package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kbstar.dto.UserDTO;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();
		db.put("id01", new UserDTO("id01", "pwd01", "james1"));
		db.put("id02", new UserDTO("id02", "pwd02", "james2"));
		db.put("id03", new UserDTO("id03", "pwd03", "james3"));
		System.out.println(db.get("id02"));//key값을 넣으면 UserDTO 값이 나온다.
		
		UserDTO u = db.get("id02");//UserDTO값은 UserDTO로 받아야한다.
		System.out.println(u);
		
		UserDTO uu = new UserDTO("id02", "0000", "jame2");
		db.put(uu.getId(), uu);
		
		Collection<UserDTO> col = db.values();
		System.out.println(col);
		for (UserDTO data : col) {
			System.out.println(data);
		}
	}

}
