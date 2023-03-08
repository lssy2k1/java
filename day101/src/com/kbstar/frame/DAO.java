package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	//CRUB(Create, Read, Update, Delete)
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;//select로 가져오면 V타입으로 리턴해.
	public List<V> select() throws Exception;//select로 모두 가져와서 V들을 List에 담아서 리턴해줘.
}
