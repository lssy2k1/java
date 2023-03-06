package shape;

public abstract class Shape {//추상클래스다. 뼈대가 있는 상태에서 만드는 개념이라 생각!
	protected int x;//다른 패키지라도 상속관계에 대해서는 자유롭게 접근 가능.
	protected int y;
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract double getArea();//함수의 모양이 없는 함수. Abstract Method
	public abstract double getCircumn();
	
	public String getXY() {
		return x + ", " + y;
	}
}
