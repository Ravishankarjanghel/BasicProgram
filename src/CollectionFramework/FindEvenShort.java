package CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenShort {

	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(11,2,39,40,15,63,7,84,99);
		List<Integer> evenList =  al.stream().filter(even->even%2==0).sorted().collect(Collectors.toList());
		System.out.println(evenList);
		List<Integer> sortedAlAsse=al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedAlAsse);
		List<Integer> sortedAlDes = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedAlDes);
	}

}
