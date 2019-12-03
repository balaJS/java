class TestShape {
	public static void main(String[] args) {
		Squre sq = new Squre();
		Circle circle = new Circle();
		System.out.println("Area of Squre value is " + sq.area(2));
		System.out.println("Area of circle value is " + circle.area(2));

		sq.distance = 2;
		System.out.println("Total Distance moved by squre = " + sq.move(sq.distance, 2));
		System.out.println("Total Distance moved by circle = " + circle.move(circle.distance, 4));
	}
}
