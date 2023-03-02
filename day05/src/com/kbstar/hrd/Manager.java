package com.kbstar.hrd;

public class Manager {
	private String id;
	private String name;
	private int salary;
	private int bonus;

	public Manager() {
	}

	public Manager(String id, String name, int salary, int bonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

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

	public int getBonus() {
		return bonus;
	}

	public int getAnnSalary() {
		int result = 0;
		result = (this.salary * 12) + this.bonus;
		return result;
	}

	public double getTax() {
		double result = 0.0;
		result = (this.salary + this.bonus) * 0.21;
		return result;
	}

	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() * 0.21;
		return result;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
