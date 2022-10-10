package assignment3;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		boolean isPanagram = true;
		char[] alphabetArray = new char[26];
		int initial = 97;
		for(int i=0;i<26;i++) {
			alphabetArray[i] = (char)initial;
			initial++;
		}
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll(" ", "");
		int count = 0;
		for(char c : alphabetArray) {
			if(s.contains(Character.toString(c))){
				count++;
				if(count==26) {
					break;
				}
				continue;
			}
			else {
				isPanagram = false;
				break;
			}
		}
		if(isPanagram) {
			System.out.println("Given String is Panagram");
		}
		else {
			System.out.println("Given String is not a Panagram");
		}
	}

}
