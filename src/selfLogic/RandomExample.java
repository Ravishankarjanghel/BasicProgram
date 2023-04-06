package selfLogic;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random ran = new Random();
		int i = ran.nextInt(10000);
		System.out.println(i);
	}
}
