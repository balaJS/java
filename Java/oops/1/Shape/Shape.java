class Shape {
	public static void main(String[] args) {
		Squre sq = new Squre();
		Circle circle = new Circle();
		System.out.println("Area of Squre value is " + sq.area(13));
		System.out.println("Area of circle value is " + circle.area(12));
	}

	public void area() {
		System.out.println("Base class method");
	}
}
