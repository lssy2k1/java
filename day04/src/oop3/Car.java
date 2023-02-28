package oop3;

public class Car {
	private String name;
	private String color;
	private int size;
	private int fsize;
	private int cfsize;

	// 생성자. (constructor)
	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	// 기름을 넣는다.
	// 기름보다 많이 넣으면 - 다시 주유 하세요
	// 음수 값이 들어가면 - 다시 주유 하세요.

	public void setCfsize(int size) {// 반환값이 없어서 void, 기름 얼마나 넣을지, 기름통량보다 더 많으면 어떡할지 구현하는 필드임
		if (size < 0 || size > fsize - cfsize) {
			System.out.println("다시 주유 하세요");
			return;
		}
		System.out.println(size + "L주유되었습니다");
		cfsize += size;
	}

	// 주행을 한다.
	// 1리터당 10km를 주행할 수 있다.
	public void go(int distance) {
		if (cfsize <= 0 || cfsize < (distance / 10)) {
			System.out.println("기름이 부족합니다");
			return;
		}
		System.out.printf("%s %dKM go...\n", this.name, distance);
		cfsize -= distance / 10;
	}

	// 멈춘다.
	public void stop() {
		System.out.printf("%s stop...\n", this.name);
	}

}