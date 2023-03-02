package com.kbstar.hrd.app;

import com.kbstar.hrd.Manager;

public class App2 {

	public static void main(String[] args) {
		Manager manager[] = new Manager[3];
		manager[0] = new Manager("301", "정수아", 100, 76);
		manager[1] = new Manager("302", "김수아", 220, 65);
		manager[2] = new Manager("303", "이수아", 320, 35);
		
		for (Manager data : manager) {
			System.out.println(data);
			System.out.printf("%d, %4.2f, %4.2f\n", data.getAnnSalary(), data.getTax(), data.getAnnTax());
		}
		
	}
}
