package oop1;

public class Car {
	public String name;
	public String color;
	public int size;
	//class는 속성과 행위로 이루어지는데, 값은 정해지지가 않아있다.
	//고객명 등을 받기 위해선 생성자가 필요함
	
	//생성자. (constructor), return타입은 존재하지 않음.
	public Car() {
		this.name = "k1";//this는 #100주소를 가리킴. #100주소의 name에는 k1이들어가고
		this.color = "red";//#100주소의 color에는 red가 들어가고...
		this.size = 1000;
	}
	
	public Car(String name, String color, int size) {
		//지정해서 만들어주는 생성자도 있지만 입력해서 만드는 생성자도 있다.
		//생성자는 이름은 동일하지만 들어가는 내용(argument)이 다르기 때문에 호출이 된다.
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	
	public void go() {//go라는 것은 class메모리의 Car에 존재하고 this들의 요소를 갖고 진행을 하게 됨.
					  //따라서 this의 요소를 갖고 go를 하게 된다.
		System.out.printf("%s, %s go car...", this.name, this.color);
	}
	public void stop() {
		System.out.println(this.name + "stop car...");
	}
	
}
