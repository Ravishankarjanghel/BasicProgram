package stringProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetedchar {

	public static void main(String[] args) {
		String str = "aaaabbcccccdeeeaffffffffpgggggghhhiiiiiiiiii";
		String strL = str.toLowerCase();
		char[] charArr = strL.toCharArray();
		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i<strL.length();i++) {
			count.putIfAbsent(charArr[i], 0);
		}
		for(int i = 0;i<strL.length();i++) {
			char ch = charArr[i];
			if(count.containsKey(charArr[i])) {
				count.put(ch, (count.get(ch)+1));
			}
		}
		char firstSingleChar = ' ';
		for(char i:count.keySet()) {
			if(count.get(i)==1) {
				firstSingleChar = i;
				break;
			}
		}
		System.out.println("First single char is "+firstSingleChar+".");

	}

}
