abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle draw completed.");
	}
	
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle draw completed.");
	}
}

public class TestAbstraction1 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		
		rec.draw();
		cir.draw();
	}
}
