package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().replaceAll(" ", "");
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			int count = 0;
			for(int j=0;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)&&i!=j) {
					count++;
				}
			}
			if(count>0&&!(list.contains(c))) {
				list.add(input.charAt(i));
				System.out.println(input.charAt(i));
			}
		}
	}
}
