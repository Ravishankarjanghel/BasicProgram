package selfLogic;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int guess,count = 0;
		int n = ran.nextInt(101);
		
		do {
			count++;
			System.out.println("Guess the number : ");
			guess = sc.nextInt();
			if(n > guess)
				System.out.println("Sorry. wrong guess. Number is greater than "+guess);
			else if(n < guess)
				System.out.println("Sorry. wrong guess. Number is less than "+guess);
		}while(guess != n);
		
		System.out.println("Congratulation, your guess is correct. you got it in "+count+" guesses.");
		sc.close();
	}

}
