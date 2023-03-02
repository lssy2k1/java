package board;

public class DAO {
	public void insert(String str) {
		System.out.println("Inserted Oracle Database Row:" + str);
	}
	public void update(int num, String str) {//해당 글번호를 입력하고 내용을 이렇게 업데이트 할게요
		System.out.println("Updated Oracle Database Row:" + num + " " + str);
	}
	public void delete(int num) {
		System.out.println("Deleted Oracle Database Row:" + num);
	}
	public String select(int num) {//해당번호를 누르면 해당 글을 리턴하겠습니다.
		return "HI. database";
	}
}
