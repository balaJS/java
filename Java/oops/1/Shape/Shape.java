class Shape {
	public String name;

	Shape(String name) {
		this.name = name;
	}

	public void getArea() {
		System.out.println("NULL, because size dosen't set here.");
	}

	public int move(int pdistance, int distance) {
		// this.distance += distance;
		// return this.distance - distance;
		return pdistance + distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
