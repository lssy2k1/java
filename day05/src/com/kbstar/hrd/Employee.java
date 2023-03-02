package com.kbstar.hrd;

public class Employee {
	private String id;
	private String name;
	private int salary;
	//getter setter
	public String getName() {
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
	public Employee() {
	}
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;//this. 는 현재 객체. 이 클래스로 인해서 만들어진 객체.
		return result;
	}
	public int getAnnSalary() {
		int result = 0;
		result = this.salary * 12;
		return result;
	}
	public double getAnnTax() {
		double result = 0;
		result = this.getAnnSalary() * 0.17;
		return result;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
