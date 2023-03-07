package com.kbstar.frame;

public interface DAO<K, V> {
	public static final String IP = "127.0.0.1";
	//상수 값을 지정해줄 수 있다.
	//static final이라는 글자가 자동으로 붙는다.
	
	public abstract void insert(V v);
	public void delete(K k);
	public void update(V v);
	
	default void connect() {
	//추상메소드 뿐만 아니라 상수, default메소드도 넣을 수 있다!
		System.out.println(IP + "에 접속하였습니다");
	}
	default void close() {
		System.out.println(IP + "에서 접속 해제하였습니다");		
	}
}
