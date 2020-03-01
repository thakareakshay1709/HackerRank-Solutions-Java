package agt.hc.java.practices;

import java.util.Scanner;

public class JavaLoops1 {

	public static void main (String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		printMultiple(N);
		scanner.close();
	}

	private static void printMultiple(int N) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(N+" x "+i+" = "+N*i);
		}
	}
}
