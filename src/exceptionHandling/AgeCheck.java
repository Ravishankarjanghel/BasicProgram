package exceptionHandling;

import java.util.Scanner;

public class AgeCheck {
	public void ageCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		try {
			if(age < 18) {
				throw new InvalidAgeException("you are Under Age for marriage.");
			}
			else if(age > 120) {
				throw new InvalidAgeException("Play with your Great Grand son and Daughter.");
			}
			else {
				System.out.println("Congratulation, You can find beautiful girl.");
			}
		}
		finally {
			System.out.println("Thank you for visiting. One day definitely you will got a girl.");
		}
	}
}
