package aggregation;

public class Car {
	public String name;
	public String color;
	public int size;

	public Car() {
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
	}

	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	public void go() {
		System.out.printf("%s, %s go car...", this.name, this.color);
	}

	public void stop() {
		System.out.println(this.name + "stop car...");
	}

}
