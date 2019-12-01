import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		arryList1();
	}
	
	public static void arryList1() {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Bala");
		list1.add("Chola");
		list1.add("Kala");
		list1.add("Wala");
		list1.add("Bala");
		
		System.out.println(list1);
		System.out.println(list1.get(4));
		System.out.println(list1.contains("Bala"));
	}
}
