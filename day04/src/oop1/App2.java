package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1 = new Car();//new Car()를 생성하면 this의 name에 k1이 들어가고 color에는 red가 들어가고.. 가 입력된다.
		car1.go();//go라는 것은 class메모리의 Car에 존재하고 this들의 요소를 갖고 진행을 하게 됨.
		car1.stop();
		System.out.println("-------------------------------");
		Car car2 = new Car("k2", "blue", 2000);
		car2.go();
		car2.stop();
		Car car3 = new Car("k3", "white", 3000);
		car3.go();
		car3.stop();
	}

}
