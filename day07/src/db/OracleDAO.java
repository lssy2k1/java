package db;

public class OracleDAO implements DAO{
//인터페이스 DAO를 implements 받아서 database에 접근하는 프로그램인 OracleDAO를 구현
	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("inserted oracle database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("deleted oracle database");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated oracle database");		
	}

}
