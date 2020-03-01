package agt.hc.java.practices;

import java.util.Scanner;

/*
 * Problem statement can be found in java-if-else pdf
 * */
public class IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		printWeird(number);
		
		input.close();
	}

	private static void printWeird(int number) {
		if(number > 0 && number <= 100)
		{
			if(number % 2 == 0)
			{
				if(number >= 2 && number <= 5)
				{
					System.out.println("Not Weird");
				}
				else if (number >= 6 && number <= 20)
				{
					System.out.println("Weird");
				}
				else
				{
					System.out.println("Not Weird");
				}
			}
			else
			{
				System.out.println("Weird");
			}
			
		}
		else
		{
			System.out.println("Invalid Number..!");
		}
		
	}

}
