package Assignment;

import java.util.Scanner;

public class StringStartEnd {

	public static void test(String str,int start,int end) {
		String s = str.substring(start,end);
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		System.out.println("Enter the start position:");
		int start = sc.nextInt();
		System.out.println("Enter the end position:");
		int end = sc.nextInt();
		sc.close();
		test(str,start,end);
	}
}
