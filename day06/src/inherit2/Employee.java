package inherit2;

public class Employee {
	private String id;
	private String name;
	private double salary;

	//getter, setter
	public double getSalary() {
		return salary;
	}
	
	//constructor
	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//method
	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}
	public double getIncentive() {
		double result = 0.0;
		return result;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
	
}











