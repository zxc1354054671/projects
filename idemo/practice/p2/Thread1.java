package p2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Thread1 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		//System.out.println(t1.getName());
		new MyThread().start();
		new MyThread().start();
//		new Thread(new MyThread2()).start();
//		new Thread(new MyThread2()).start();
		try {
			//Ïß³ÌÐÝÃß
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new StringBuffer();
		new LinkedList();
		new HashSet();
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
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}