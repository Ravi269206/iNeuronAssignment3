package assignment3;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase().replaceAll(" ","");
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		
	}
}
