
public class Operation {
	float add(float num1, float num2) {
		return num1 + num2;
	}
	
	float sub(float num1, float num2) {
		return num1 - num2;
	}
	
	float multply(float num1, float num2) {
		return num1 * num2;
	}
	
	float divide(float num1, float num2) {
		float output = num1 / num2;
		return output;
	}
	
	public float calculate(float num1, float num2, int opIndex) {
		float output = 1;
		
		if (opIndex == 0) {
			output = this.add(num1, num2);
		} else if (opIndex == 1) {
			output = this.sub(num1, num2);
		} else if (opIndex == 2) {
			output = this.multply(num1, num2);
		} else if (opIndex == 3) {
			output = this.divide(num1, num2);
		}
		
		return output;
	}
}
