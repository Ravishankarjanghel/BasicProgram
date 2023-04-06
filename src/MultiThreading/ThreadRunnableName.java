package MultiThreading;

class ThreadR1 implements Runnable{
	public void run() {
		int i = 10;
		while(i<=5000) {
			System.out.println("ThreadR1 : "+ i++);
		}
	}
}
class ThreadR2 implements Runnable{
	
	public void run() {
		int i = 10;
		while(i<=5000) {
			System.out.println("ThreadR2 : "+ i++);
		}
	}
}
public class ThreadRunnableName {
	public static void main(String[] args) {
		ThreadR1 r1 = new ThreadR1();
		Thread t1 = new Thread(r1, "ABC");
		ThreadR2 r2 = new ThreadR2();
		Thread t2 = new Thread(r2, "XYZ");
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}