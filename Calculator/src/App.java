
public class App {
	public static Operation op = new Operation();
	public static Container app = new Container();
	
	public static void main(String[] args) {
//		System.out.println("App started...");
//		int num1 = 6;
//		int num2 = 3;
//		int local_var = (int) op.add(num1, num2);
//		System.out.println("Output is " + local_var);
//		System.out.println("App stoped.");
		System.out.println("Now this file is not used");
	}
	
	
	public float calculate(float num1, float num2, int opIndex) {
		float output = 1;
		
		if (opIndex == 0) {
			output = op.add(num1, num2);
		} else if (opIndex == 1) {
			output = op.sub(num1, num2);
		} else if (opIndex == 2) {
			output = op.multply(num1, num2);
		} else if (opIndex == 3) {
			output = op.divide(num1, num2);
		}
		
		return output;
	}

}
