package inherit;

public class App2 {

	public static void main(String[] args) {
		//Manager is a Employee
		Employee e = new Manager("100", "james", 500, 50);
		//Manager m = new Employee("100", "james2", 550);//m은 e이지만 e는 m이 아니다.
		
		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james2", 500);
		ea[1] = new Employee("200", "james3", 500);
		ea[2] = new Manager("100", "james1", 500, 50);
		ea[3] = new Manager("100", "james4", 500, 50);
		ea[4] = new Sales("300", "jamess", 500, "seoul", 0.35);
		//배열을 생성할 때도, Manager는 Employee의 상속을 받았기 때문에 같은 배열로 들어갈 수 있다!
		
		for(Employee data : ea) {
			System.out.println(data);//출력 시 manager는 오버라이딩한 toString으로 출력됨.
			System.out.println(data.getAnnSalary());
			//연봉 가져와. Employee는 연봉만 가져오고 Manager는 bonus까지 합쳐서 연봉 산출해줌.
			//출력하는 것이 달라! 이것이 다형성. 상속을 활용하고 상속받은 것 내에서 오버라이딩을 하였음.
			if(data instanceof Sales) {
				Sales s = (Sales)data;
				//객체의 타입캐스팅; data 인스턴스 중 Sales인 것을 골라서 타입을 Sales로 변경해준다.
				System.out.println(s.getIncentive());
			}
			//data.getIncentive();//다형성에서 Sales 내 specialized된 함수는 보이지 않는다.
			//Sales가 Employee[]내에 선언되었기 때문에 Employee에 정의된 함수들만 data객체에서 확인할 수 있다.
			//다형성을 구현하기 위해선 상위 클래스의 함수를 잘 이용하여야 한다. 따라서 상위 클래스 함수를 잘 설계해야 한다!!!
			//database나 객체 설계를 하는 사람들은 원론적으로 설계를 하지만, 프로그래밍 할 때는 버거울 수가 있음.
			
			//따라서 위의 if문처럼 조건문과 객체의 타입캐스팅을 통해 인스턴스가 Sales인 것을 선별하고 형변환.
			//새로 형변환한 객체에서는 원래 Sales의 메소드 getIncentive를 사용할 수 있다.
		}
		
	}

}
