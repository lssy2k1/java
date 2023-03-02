package overloading;

public class App {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.sum(10, 20));// 오버로딩. 메소드는 동일한데 아규먼트가 다름.
										  //리턴이 다른것에 대해서는 신경 안씀(double, int 노상관), 함수가 어떻건 상관 없음.
		System.out.println(c.sum(10, 20, 30));
		System.out.println(c.sum(10, 20, 30, 40));
		
	}

}
