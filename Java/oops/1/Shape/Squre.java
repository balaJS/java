class Squre extends Shape {
	public int size;
	public int distance;
	
	Squre(String name, int size, int distance) {
		super(name);
		this.distance = distance;
		this.size = size;
	}

	public int getArea() {
		return this.size * this.size;
	}
}
