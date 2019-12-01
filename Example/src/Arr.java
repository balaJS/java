import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {
//		array1();
		array2();
	}
	
	public static void array1() {
		int i, j;
		int[] arr1 = {1, 4, 7, 0, 9};
		for (i = 0; i < arr1.length; i++) {
			j = arr1[i];
			System.out.print(j);
		}
	}
	
	public static void array2() {
		int[] arr = {2, 3, 4, 5, 6, 8};
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
