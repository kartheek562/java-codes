//program to calculate electricity bill 

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of units in meter:");
		 a =sc.nextInt();
		 if(a<=100) {
			 int b=a*1;
			 System.out.println("amount:"+b);
		 }
		 else if(a>100 && a<=200) {
			 int c=(100*1)+(a-100)*2;
			 System.out.println("amount:"+c);
		 } 
		 else if(a>200 && a<=300) {
			 int d=(100*1)+(100*2)+(a-200)*3;
			 System.out.println("amount:"+d);
		 } 
		 else if(a>300 && a<=400) {
			 int e=(100*1)+(100*2)+(100*3)+(a-300)*4;
			 System.out.println("amount:"+e);
			 
		 }
		 else {
			 int f=(100*1)+(100*2)+(100*3)+(100*4)+(a-400)*5;
				 System.out.println("amount:"+f);
			 
		 }
	}

}
