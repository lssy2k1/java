package ws0228;

public class Employee {
	private String name;
	private double salary;

	// 생성자
	public Employee() {
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public double getAnnSalary() {
		// System.out.printf("%4.2f\n", (salary * 12.0));//App내에서 Sum을 구할 때 함수 호출 시
		// print가 되어서 미사용
		return salary * 12.0;
	}

	public double getTax() {
		// System.out.printf("%4.2f\n", (salary * 0.0372));
		return salary * 0.0372;
	}

}
