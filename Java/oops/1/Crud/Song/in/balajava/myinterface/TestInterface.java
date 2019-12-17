package in.balajava.myinterface;

interface Printable {
	void print();
	
	default void myPrint1() {
		System.out.println("interface Printable.myPrint1");
	}
	String getName();
}

interface Showable {
	void show();
}

class MyTestInterFace1 implements Printable, Showable {
	private String name;
	
	public String toString() {
		return "Overriding native method(toString) was done.";
	}
	
	MyTestInterFace1(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void print() {
		System.out.println("MyTestInterFace1.print");
	}
	
	public void show() {
		System.out.println("MyTestInterFace1.show");
	}
	
	public void cutomMethod1() {
		System.out.println("MyTestInterFace1.cutomMethod1");
	}
	
	public void myPrint1() {
		System.out.println("class MyTestInterFace1.myPrint1");
	}
}

class MyTestInterFace2 implements Printable, Showable {
	public void print() {
		System.out.println("MyTestInterFace2.print");
	}
	
	public void show() {
		System.out.println("MyTestInterFace2.show");
	}
	
	public void cutomMethod2() {
		System.out.println("MyTestInterFace2.cutomMethod2");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class TestInterface extends MyTestInterFace2 {
	public static void main(String[] args) {
		Printable obj0 = new MyTestInterFace2();
		obj0.print();
		obj0.myPrint1();
		
		Showable obj1 = new MyTestInterFace2();
		obj1.show();
		
		Printable obj01 = new MyTestInterFace1("Printable");
		obj01.print();
		obj01.myPrint1();
		
		Showable obj11 = new MyTestInterFace1("Showable");
		obj11.show();
		System.out.println("========================================");
		
		Printable obj12 = obj01;
		System.out.println(obj12.getName());
		System.out.println(obj12);
		
	}
}
