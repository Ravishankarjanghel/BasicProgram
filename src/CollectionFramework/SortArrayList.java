package CollectionFramework;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> in = new ArrayList<Integer>();
		ArrayList<Character> ch = new ArrayList<Character>();
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter in both ArrayList : ");
		int n = sc.nextInt();
		int m = n;
		
		System.out.println("Enter "+ n +" element in Interger Arraylist: ");
		while(n>=1) {
			in.add(sc.nextInt());
			n--;
		}
		
		System.out.println("Enter "+ m +" element in Character Arraylist: ");
		while(m>=1) {
			ch.add(sc.next().charAt(0));
			m--;
		}
		
		System.out.println("Before Sorting : ");
		System.out.println(in);
		System.out.println(ch);
		
		Collections.sort(in);
		Collections.sort(ch);
		
		System.out.println("After Sorting : ");
		System.out.println(in);
		System.out.println(ch);
		
		sc.close();
	}
}
