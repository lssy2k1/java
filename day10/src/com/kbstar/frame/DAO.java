package com.kbstar.frame;

public interface DAO<K, V> {

	public void insert(V v) throws Exception;//잘 안될때를 대비해서 예외선언을 해!
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
}
