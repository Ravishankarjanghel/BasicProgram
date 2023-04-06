package selfLogic;

public class StarSleep {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
				Thread.sleep(200);
			}
			System.out.println();
		}

	}

}
