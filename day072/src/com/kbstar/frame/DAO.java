package com.kbstar.frame;

public interface DAO<K, V> {
	//제네릭.어떤 값이 들어올지 모르지만 K, V값이 들어올 거다라고 예상하여 작성하는 것.
	//K, V는 아무런 문자 써도 상관없음.
	//클래스나 메소드의 타입을 매개변수화하여 여러 종류의 타입에 대해 재사용이 가능하게 하는 방법입니다.
	//key와 value의 값은 나중에 정할거야.
	//언제? interface를 상속을 받아서 UserDAO로 구현을 할 때 만들거야.
	public void insert(V v);//value값을 넣을거지?
	public void delete(K k);//key값을 넣을거지?
	public void update(V v);
}
