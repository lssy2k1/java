package db;

public class MariaDBDAO implements DAO {

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("inserted mariadb database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("deleted mariadb database");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated mariadb database");
	}

}
