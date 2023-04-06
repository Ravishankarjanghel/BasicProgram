package MultiThreading;

class RunnableClass1 implements Runnable{
	public void run() {
		int i = 1;
		while(i<=500) {
			System.out.println("Thread 1 : "+ i++);
		}
	}
}

class RunnableClass2 implements Runnable{
	public void run() {
		int i = 1;
		while(i<=500) {
			System.out.println("Thread 2 : "+ i++);
		}
	}
}

class RunnableClass3 implements Runnable{
	public void run() {
		int i = 1;
		while(i<=500) {
			System.out.println("Thread 3 : "+ i++);
		}
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		RunnableClass1 rn1 = new RunnableClass1();
		RunnableClass2 rn2 = new RunnableClass2();
		RunnableClass3 rn3 = new RunnableClass3();
		
		Thread t1 = new Thread(rn1);
		Thread t2 = new Thread(rn2);
		Thread t3 = new Thread(rn3);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
