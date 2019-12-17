package in.balajava.thread;

class MyThreadTest extends Thread {
	public void run() {
		System.out.println("Thread running...");
	}
}

public class MyThread {
	public static void main(String[] args) {
		MyThreadTest thread1 = new MyThreadTest();
		thread1.start();
		
		int arr[] = {1, 2, 3, 4};
		
		for (int i : arr) {
			try {
				Thread.sleep(2000);
				System.out.println("Thread running after 3 seconds..." + i);
				System.out.println("Thread name is " + thread1.getName());
				Thread currentThread = Thread.currentThread();
				currentThread.setName("Bala");
				System.out.println("Current thread is " + currentThread);
				System.out.println("After setName, Thread name is " + currentThread.getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
