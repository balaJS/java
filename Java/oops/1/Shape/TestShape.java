class TestShape {
	public static void main(String[] args) {
		Squre sq = new Squre("BalaSqure", 5, 7);
		Circle circle = new Circle("BalaCircle");
		System.out.println("Name of Squre is " + sq.getName());
		System.out.println("Area of Squre value is " + sq.getArea());
		System.out.println("Total Distance moved by squre = " + sq.move(sq.distance, 2));


		sq.distance = 2;
		System.out.println("Name of circle is " + circle.getName());
		System.out.println("Area of circle value is " + circle.area(2));
		System.out.println("Total Distance moved by circle = " + circle.move(circle.distance, 4));
	}
}
