package ws0228;

public class Manager {
	private String name;
	private double salary;
	private double bonus;

	// 생성자
	public Manager() {
	}

	public Manager(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	// 매서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	public double getAnnSalary() {
		// System.out.printf("%4.2f\n",((salary * 12.0) + bonus));
		return (salary * 12.0) + bonus;
	}

	public double getTax() {
		// System.out.printf("%4.2f\n",(((salary * 12.0) + bonus) * 0.0372));
		return ((salary * 12.0) + bonus) * 0.0372;
	}
//	public double getTax() {//이 코드는 this.으로 메서드 결과값을 불러왔지만, 출력하는 줄도 있어서 연봉이 여러번 출력됨.
//		System.out.printf("%4.2f\n",(this.getAnnSalary() * 0.0372));
//		return (this.getAnnSalary() * 0.0372);
//	}

}
