class Circle extends Shape {
	public int distance = 12;

	public float area(float radius) {
		float PI = 22/7;
		return PI * radius * radius;
	}
}
