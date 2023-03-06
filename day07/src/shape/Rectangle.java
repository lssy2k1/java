package shape;

public class Rectangle extends Shape {// Shape에서 상속받아서 만들어졌지만 사각형이다!

	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override // 이 도형은 무조건 두 가지 함수가 구현되어져야만 한다. 지우면 빨간줄이 나오고 add unimplemented Method를 추가해야함.
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width + height) * 2;
	}

}
