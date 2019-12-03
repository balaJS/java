class Shape {


	public void area() {
		System.out.println("Base class method");
	}

	public int move(int pdistance, int distance) {
		// this.distance += distance;
		// return this.distance - distance;
		return pdistance + distance;
	}
}
