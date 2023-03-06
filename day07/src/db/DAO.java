package db;

public interface DAO {//인터페이스엔 기능 정의만 되어있고 구현은 안되어있다.
	public void insert(Object obj);//뭐를 insert할거에요? 모든지 다 넣고싶다? object 사용
	public void delete(Object obj);
	public void update(Object obj);
}
