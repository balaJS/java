abstract class Shape {
	private String shapeName;

	abstract void draw();
	abstract float getArea();

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public String getShapeName() {
		return this.shapeName;
	}
}

class Rectangle extends Shape {
	private int length, width;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	public float getArea() {
		return this.getLength() * this.getWidth();
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle draw completed.");
	}
}

class Circle extends Shape {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	void draw() {
		System.out.println("Circle draw completed.");
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	public float getArea() {
		int radius = this.getRadius();
		float area = (22/7) * radius * radius;
		return area;
	}
}

public class TestAbstraction1 {
	public static void main(String[] args) {
//		Wrong understanding about abstraction here.
//		Rectangle rec = new Rectangle(0, 0);
//		Circle cir = new Circle(5);

//		rec.draw();
//		cir.draw();

//		After Understood use of abstraction here.
		Shape aRec = new Rectangle(20, 10);
		Shape aCir = new Circle(3);

		aRec.setShapeName("Rectangle");
		System.out.println(aRec.getShapeName());
		System.out.println(aRec.getArea());

		aCir.setShapeName("Circle");
		System.out.println(aCir.getShapeName());
		System.out.println(aCir.getArea());

		System.out.println(aCir.getClass());
		
	}
}
