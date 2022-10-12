package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		char[] firstCharArray = sc.nextLine().strip().toLowerCase().toCharArray();
		System.out.println("Enter second String");
		char[] secondCharArray = sc.nextLine().strip().toLowerCase().toCharArray();
		Arrays.sort(secondCharArray);
		Arrays.sort(firstCharArray);
		
		if(Arrays.compare(firstCharArray, secondCharArray)==0) {
			System.out.println("The strings are anagrams.");
		}
		else {
			System.out.println("The strings are not anagrams.");
		}
		

	}

}
