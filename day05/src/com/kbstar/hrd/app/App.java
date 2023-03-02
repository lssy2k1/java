package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "이말숙", 500);
		System.out.println(e.toString());//.toString을 안써도 자바에서 넣어서 출력해줌.
		System.out.println(e.getSalary());//데이터를 캡슐화시켜서 접근을 막는다.
		System.out.println(e.getTax());
		System.out.println(e.getAnnSalary());
		System.out.println(e.getAnnTax());
		System.out.println("======================================");
		
		Employee emps[] = new Employee[3];
		emps[0] = new Employee("200", "홍말자", 400);
		emps[1] = new Employee("201", "김말자", 450);
		emps[2] = new Employee("202", "송말자", 490);
		
		for(Employee data : emps) {
			System.out.println(data.toString());
			System.out.println(data.getTax());
			System.out.println(data.getAnnSalary());
			System.out.println(data.getAnnTax());
			System.out.printf("%f %d %f\n", data.getTax(), data.getAnnSalary(), data.getAnnTax());
		}
	}

}
