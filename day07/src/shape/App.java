package shape;

public class App {

	public static void main(String[] args) {
		//Shape s = new Shape(10, 10);//Shape는 골격일 뿐 도형을 생성할 수는 없다.
		Shape s1 = new Triangle(10 ,20 ,100, 80);
		//이 부분을 쓰지 않고도 선택을 하면 그려지게 하고싶은데? 그걸 가능하게 하는게 spring
		//class와 class끼리 관계를 루즈하게 하면서 프로그래밍 하게 한다! -> spring
		//관계를 강하게 하면 class하나가 죽으면 다른 class에 영향.
		System.out.println(s1.getXY());
		System.out.println(s1.getArea());
		System.out.println(s1.getCircumn());
	}

}
