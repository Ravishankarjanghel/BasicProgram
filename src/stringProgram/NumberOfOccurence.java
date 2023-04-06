package stringProgram;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfOccurence {

	public static void main(String[] args) {
		String str = "malayalam";
		String strL = str.toLowerCase();
		char[] charArr = strL.toCharArray();
		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i<strL.length();i++) {
			count.putIfAbsent(charArr[i], 0);
		}
		for(int i = 0;i<strL.length();i++) {
			char ch = charArr[i];
			if(count.containsKey(ch)) {
				count.put(ch, (count.get(ch)+1));
			}
		}
		System.out.println(count);
	}
}
