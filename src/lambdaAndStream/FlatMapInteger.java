package lambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapInteger {

	public static void main(String[] args) {
		List<Integer> al1 = Arrays.asList(1,2,3,4,5);
		List<Integer> al2 = Arrays.asList(6,7,8,9,10);
		List<Integer> al3 = Arrays.asList(11,12,13,14,15);
		
		List<List<Integer>> al = Arrays.asList(al1,al2,al3);
		
		List<Integer> al10 = al.stream().flatMap(a -> a.stream().map(b -> b+10)).collect(Collectors.toList());
		System.out.println("Adding sum : ");
		System.out.println(al10);
		
		List<Integer> alEven = al.stream().flatMap(a -> a.stream()).filter(b -> b%2 == 0).collect(Collectors.toList());
		
		System.out.println("Even number : ");
		System.out.println(alEven);
		
		Object[] odd = al.stream().flatMap(a -> a.stream()).filter(b -> b%2 != 0).toArray();
		for(Object i:odd) {
			System.out.println(i);
		}
	}

}
