package CollectionFramework;

import java.util.*;

//Create at Character array where duplicate are not allowed.
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Character> ch = new HashSet<Character>();
		ch.add('z');
		ch.add('m');
		ch.add('o');
		ch.add('d');
		ch.add('e');
		ch.add('f');
		ch.add('a');
		ch.add('b');
		ch.add('b');
		ch.add('a');
		
		System.out.println("Printing by using For Each Loop : ");
		for(Character i : ch) {
			System.out.println(i);
		}
		System.out.println("Printing by using Iterator : ");
		Iterator<Character> it = ch.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(ch);
	}

}
