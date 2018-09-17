package p2;

public class Thread2 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		
		new 
		MyThread2 t2 = new MyThread2();
		t2.
	}
}
class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	
}
