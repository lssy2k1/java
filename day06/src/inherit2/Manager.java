package inherit2;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		super();// 위에 있는 컨스트럭터 코드를 사용한다. 상속이 아님.
	} 			// 컨스트럭터는 불러서 사용하고 getter setter로 bonus만 불러와서 추가 컨스트럭터 생성 없이 이용도 가능.

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}

	// constructor using field에서 Employee(String, String, double)을 선택하여 추가할 수 있다.
	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//함수의 재정의(overriding). 상속받은 함수를 그대로 쓸 수도 있다. 하지만 필요에 의해 오버라이딩할 수 있다.

	@Override//anotation주석이 붙는다.
	public double getAnnSalary() {
		double result = 0.0;
		result = (this.getSalary() + this.bonus) * 12;//private이라서 접근이 안됨. protected로 바꾸면 접근 가능
													  //또는 getter를 설정하여 가져오게 할 수 있음.
		//result = super.getAnnSalary() + (this.bonus * 12);
		//상위에 있는 getAnnSalary를 불러와서 계산할 수도 있다.
		return result;
	}

	@Override
	public String toString() {
		return super.toString() + " " + bonus;//상속받은 Employee의 toString을 super로 가져옴.
	}
	//source에서 toString을 누르면 inherited를 설정할 수 있다.
}








