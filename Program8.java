package assignment3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		char[] specialCharArray = {'!','@','#','$','%','^','&','*','?','.',','};
		Scanner sc = new Scanner(System.in);
		char[] inputArray = sc.nextLine().toLowerCase().replaceAll(" ","").toCharArray();
		int specialCharacterCount =0;
		for( char c : inputArray) {
			for(char c1 : specialCharArray) {
				if(c==c1) {
					specialCharacterCount++;
				}
			}
		}
		System.out.println(specialCharacterCount);
	}

}
