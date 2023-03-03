package inherit2;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "james", 500);
		System.out.println(e);
		System.out.println(e.getAnnSalary());
		
		Manager m = new Manager("200", "Kim", 500, 50);
		System.out.println(m);//출력 시 Employee[]로 정보가 나옴.
							  //M is a E 의 관계가 성립한다. E is a M은 성립 안함.
							  //toString을 오버라이딩하는 경우 Manager로 정보를 나오게 할 수 있음.
		System.out.println(m.getAnnSalary());
	}

}
