package access;

public class Employee {
	private String id;
	protected String name;
	int salary;//아무것도 안쓰면 default 접근제어자

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
	private int getAnnSalary() {//함수를 private으로 쓰면 클래스 내에서만 사용 가능. getAnnTax에 불러와서 쓸 때만 사용.
								//그런데 함수에 private으로 쓰는 경우는 매우 적음.
		int result = 0;
		result = this.salary * 12;
		return result;
	}
	protected double getAnnTax() {
		double result = 0;
		result = this.getAnnSalary() * 0.17;
		return result;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
