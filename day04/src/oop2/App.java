package oop2;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.toString());//출력을 하기 위해 class에 toString을 정의하고 출력.
		
		Employee e2 = new Employee("이말숙", 5000000);
		//e2.salary = 9000000;//중요한 변수들(연봉,아이디)이 class 내에 들어가있고 현재는 오픈되어있는 상태. 접근을 막아야함.
		
		System.out.println(e2.toString());
		System.out.println(e2.getAnnSalary());
		System.out.println(e2.getTax());
		
		e2.setName("이말자");
		System.out.println(e2.toString());
	}

}
