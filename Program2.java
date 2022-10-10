package assignment3;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = "";
		String[] stringArray = s.split(" ");
		for(String s2: stringArray) {
			StringBuilder sb = new StringBuilder(s2.toLowerCase());
			sb.reverse();
			s1 += sb+" ";
		}
	System.out.println(s1);
	}

}
