class Shape1 {
	void draw() {
		System.out.println("Base class draw method.");
	}
}

class Rectangle1 extends Shape1 {
	void draw() {
		System.out.println("Rectangle draw completed.");
	}
}

class Circle1 extends Shape1 {
	void draw() {
		System.out.println("Circle draw completed.");
	}
}

class WithoutAbstraction1 {
	public static void main(String[] args) {
		Rectangle1 rec = new Rectangle1();
		Circle1 cir = new Circle1();
		
		rec.draw();
		cir.draw();
	}
}
