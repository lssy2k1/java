package inherit2;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		
		Object obj1 = new Employee();//자바의 모든 class는 extends Object()가 생략되어있다.
		Object obj2 = new Manager();
		Object obj3 = new Date();//나중에 프로그래밍을 하다가 '상속되어서 이런거구나'하게 됨
	}

}
