package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	@Override
	public void insert(ItemDTO v) {// insert할때는 ItemDTO를 넣어줄테니 데이터베이스에 넣어주세요
		connect();
		System.out.println(v);
		System.out.println("Inserted...");//실제 구현 시 DML의 insert문이 실제로는 여기 들어가게 됨.
		close();
	}

	// int id = 100;도 넣을 수 있나요? primitive type이라서 못넣지 않나요?
	// 아니요. 자바에서 언박싱을 통해 넣을 수 있게 변형이 됩니다.
	@Override
	public void delete(Integer k) {// delete 할때는 primary key인 Integer를 넣어줄테니 데이터베이스에서 삭제해주세요.
		System.out.println(k);
		System.out.println("Deleted...");
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated...");
	}

}
