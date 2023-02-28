package oop2;

import java.util.Random;

public class Employee {
	private String id;//class밖에서 수정을 못하도록 private으로 막는 장치. 처음에 생성될 때만 건들 수 있음.
	private String name;
	private int salary;

	// 생성자는 마우스 오른쪽 -> source -> generate constructor에서 만들 수 있음.
	// 생성자를 오버로드 한 것, 아규먼트에 따라서 다른게 호출됨.
	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;//이 경우는 this.를 생략할 수 없음. 들어온 데이터를 똑같은 들어온 데이터에 넣는다? 말이 안됨.
		this.name = name;//이 주소(this)에 새로 들어온 데이터를 넣겠다. 이 경우는 생략 안돼!
		if(salary < 0) {//여기서 salary는 입력받은 값.
			this.salary = 0;
		}else {
			this.salary = 0;
		}
		this.salary = salary;
	}

	public Employee(String name, int salary) {// arguments가 2개라도 id는 설정해주는 것 잊지말기;
		this("10000", name, salary);//생성자에서 다른 생성자를 호출할 때는 this로 호출한다. 단, 가장 윗줄에 써야함.
									//argument 세개가 있는 컨스트럭터가 자동으로 호출되게 됨.
		//Random r = new Random();
		//this.id = String.valueOf(r.nextInt(100) + 1);
	}

	public String getName() {//source에서 getter와 setter를 설정해줌.
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnSalary() {
		return this.salary * 12;//this.를 빼더라도 컴파일러는 자동으로 this.을 붙임.
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override//이게 뭐에요? 아직 안배움.
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
