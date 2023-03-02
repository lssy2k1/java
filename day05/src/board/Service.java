package board;

public class Service {
	
	DAO dao;
	
	public Service() {
		dao = new DAO();//객체를 만들어야 사용을 시작할 수 있음.
	}
	
	public void register(String str) {
		//security or log
		dao.insert(str);//service는 dao에게 정보를 입력하라고 전달을 함.
	}
	public void remove(int num) {
		dao.delete(num);
	}
	public void modify(int num, String str) {
		dao.update(num, str);
	}
	public String get(int num) {
		return dao.select(num);
	}
	
}
