//programto calculate square root for the given number

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class Sqrt {
	public static void main (String[]args) {
		Double a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number to sqrt :");
		a = sc.nextDouble();
		b=Math.sqrt(a);
		System.out.println("the sqrt of the number is :"+b);
		
		
	}

}
