package MultiThreading;

import java.time.LocalTime;

class Thread1 extends Thread{
	public void run() {
		int i = 1;
		while(i<=500) {
			System.out.println("Thread 1 : "+LocalTime.now());
			i++;
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		int i = 1;
		while(i<=500) {
			System.out.println("Thread 2 : "+LocalTime.now());
			i++;
		}
	}
}

class Thread3 extends Thread{
	public void run() {
		int i = 1;
		while(i<=500) {
			System.out.println("Thread 3 : "+LocalTime.now());
			i++;
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();	
	}
}
