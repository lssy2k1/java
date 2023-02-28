package oop2;

public class Employee {
	public String id;
	public String name;
	public int salary;
	
	//생성자는 마우스 오른쪽 -> source -> generate constructor에서 만들 수 있음.
	//생성자를 오버로드 한 것, 아규먼트에 따라서 다른게 호출됨.
	public Employee() {
	}
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
}
