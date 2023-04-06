package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortALNew {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(9);
		al1.add(45);
		al1.add(98);
		al1.add(30);
		//al1.sort(Comparator.naturalOrder());
		//al1.sort(Comparator.reverseOrder());
//		Collections.sort(al1);
		System.out.println(al1);
		List<Integer> sortedAs = al1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedAs);
		List<Integer> sortedDs = al1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedDs);

	}
}
