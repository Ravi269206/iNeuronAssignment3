package assignment3;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "";
		for(char c: s.toCharArray()) {
			s1 = c+s1;
		}
		System.out.println(s1);
	}

}
