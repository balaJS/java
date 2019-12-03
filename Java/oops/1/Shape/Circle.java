class Circle extends Shape {
	public int distance = 12;

	Circle(String name) {
		super(name);
	}

	public float area(float radius) {
		float PI = 22/7;
		return PI * radius * radius;
	}
}
