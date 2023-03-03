package inherit2;

public class App2 {

	public static void main(String[] args) {
		Employee e = new Manager("100", "james", 500, 50);

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james2", 500);
		ea[1] = new Employee("200", "james3", 500);
		ea[2] = new Manager("100", "james1", 500, 50);
		ea[3] = new Manager("100", "james4", 500, 50);
		ea[4] = new Sales("300", "jamess", 500, "seoul", 0.35);

		for (Employee data : ea) {
			System.out.println(data);
			System.out.println(data.getAnnSalary());
			System.out.println(data.getIncentive());
		}
		System.out.println("========================================");
		TaxCal t = new TaxCal();
		double result = t.getTax(ea[3]);//manager 객체도 getTax(Employee)를 사용할 수 있음.
		//프로모션을 함수의 아규먼트로 쓰는 방법!
		System.out.println(result);
	}

}
