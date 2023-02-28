package ws0228;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee("apple", 1000000);
		Employee e2 = new Employee("banana", 3000000);
		Employee e3 = new Employee("caramel", 4000000);
		Employee e4 = new Employee("doll", 5000000);
		Employee e5 = new Employee("elec", 1000000);
		Employee e[] = { e1, e2, e3, e4, e5 };
		double sumE = 0.0;

		Manager m1 = new Manager("fall", 300000, 10000);
		Manager m2 = new Manager("great", 700000, 20000);
		Manager m3 = new Manager("home", 900000, 30000);
		Manager m4 = new Manager("image", 2000000, 40000);
		Manager m5 = new Manager("juice", 1800000, 50000);
		Manager m[] = { m1, m2, m3, m4, m5 };
		double sumM = 0.0;

		for (int i = 0; i < e.length; i++) {
			System.out.printf("%d번째 직원의 연봉은 %10.2f, 세금은 %10.2f\n", i + 1, e[i].getAnnSalary(), e[i].getTax());
			System.out.println(e[i].toString());
			sumE += e[i].getAnnSalary();
		}
		System.out.printf("----------직원 연봉의 총 합은 %10.2f----------\n", sumE);

		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d번째 매니저의 연봉은 %10.2f, 세금은 %10.2f\n", i + 1, m[i].getAnnSalary(), m[i].getTax());

			System.out.println(m[i].toString());
			sumM += m[i].getAnnSalary();
		}
		System.out.printf("----------매니저 연봉의 총 합은 %10.2f----------\n", sumM);
	}
}
