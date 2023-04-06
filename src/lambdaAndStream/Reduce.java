package lambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("a","b","c","d");
		Optional<String> reduced = l.stream().reduce((v,cv)-> {return v+cv;});
		
		System.out.println(reduced.get());

	}

}
