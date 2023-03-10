package statics;

public class Car {
	private String name;
	private String maker;
	public static String makerName = "HD";
	//static은 객체가 생성될 때 관여하지 않음.
	//클래스는 static을 소유한다. 아래 다시 언급
	//Car는 name과 maker를 갖고 있고 Car가 만드는 object는 두가지 속성을 갖고 있다.
	//그러나 Static은 class가 갖고 있는 "별도"의 객체다!
	//따라서 Car로 만들어지는 객체에 부여되는 속성은 아니다. 객체 생성과는 관계가 없어!
	//static을 사용하고 싶을 때 어떠한 클래스에서도(같은 패키지) Car.static명으로 쓸 수 있다.
	//static이 많아져도 유지보수가 어려워짐. utility성격으로만 많이 사용함.
	//static함수 내에서 사용되는 변수도 static변수여야 한다.
	
	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}
	
}
