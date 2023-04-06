package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueFromStringArray {

	public static void main(String[] args) {
		String[] str = {"google","yahoo","gmail","hotmail","tesla","tesla","yahoo","gmail"};
		List<String> strList = Arrays.asList(str);
		System.out.println(strList);
		Set<String> strSet = new LinkedHashSet<String>(strList);
		System.out.println(strSet);
	}

}
