package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K, V> {
	// 'app화면에서 어떤 기능들이 있다'를 구현하는 게 Service단락에서 해줌.
	// 일반적인 가입, 조회, 삭제 기능이다. 추후 DAO와 연동하여 DATABASE에서 처리.
	// 메일을 보내는 service를 추가한다 -> DAO에도 보내고 SMS서버에도 보내고.
	// 이체서비스가 생긴다하면 추가해준다.
	// insert, delete, update는 데이터베이스 처리 관점 용어이고
	// register, remove, modify는 고객이 이용하는 서비스 관점 용어다.
	
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
}
