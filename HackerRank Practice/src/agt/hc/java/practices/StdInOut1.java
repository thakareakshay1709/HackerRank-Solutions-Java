package agt.hc.java.practices;

import java.util.Scanner;

/*
 * Problem statement can be referred from file java-stdin-and-stdout-1
 * */

public class StdInOut1 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}
