package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		int start = 97;
		
		ArrayList<Character> consonantList = new ArrayList<Character>();
		List<Character> vowelList = new ArrayList<Character>();
		while(consonantList.size()!=21) {
			char c = (char) start;
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelList.add(c);
			}
			else {
				consonantList.add(c);
			}
			start++;
		}
		System.out.println(vowelList);
		System.out.println(consonantList);
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase().replaceAll(" ", "");
		
		int consonantCount = 0;
		int vowelCount =0;
		for(char c:s.toCharArray()) {
			if(vowelList.contains(c)) {
				vowelCount ++;
			}
			else if(consonantList.contains(c)) {
				consonantCount ++;
			}
		}
		System.out.println("Number of Consonants in the string are: "+consonantCount);
		System.out.println("Number of vowels in the string are: "+vowelCount);
	}

}
