package stringProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringWordInAlphaStream {

	public static void main(String[] args) {
		String s = "zkdk afhd xkdkd ysysy bshsh chsjs askdk afkfkf";
		String[] ch = s.split(" ");
		List<String> sorted = Arrays.asList(ch).stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		List<String> l = Arrays.asList(ch);
		Collections.sort(l);
		System.out.println(l);
	}

}
