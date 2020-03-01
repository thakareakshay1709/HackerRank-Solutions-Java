package agt.hc.java.practices;

import java.util.Scanner;

public class OutputFormatting {

	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
//             for (int j = 0; j < 15; j++) {
//				s1 = s1+" ";
//			}
             int x=sc.nextInt();
//             String s2 = String.valueOf(x);
//             if(x<100)
//             {
//            	 
//            	 if(x>=10)
//            	 {
//            		 s2 = "0"+s2;
//            	 }
//            	 else if(x<10)
//            	 {
//            		 s2="00"+s2;
//            	 }
//             }
             
             //System.out.println(s1+s2);
             System.out.printf("%-15s%03d\n",s1,x);
         }
         //System.out.println("s1"+s1+", x="+x);
         sc.close();
         System.out.println("================================");

 }
	
}
