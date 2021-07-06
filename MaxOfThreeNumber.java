//program to calculate maximum of three numbers
package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the a value:");
    a =sc.nextInt();
    System.out.println("enter the b value:");
    b =sc.nextInt();
    System.out.println("enter the c value:");
    c =sc.nextInt();
    if (a>b && a>c) {
    	 System.out.println("the maximum  value is:"+a);
    }
    else if(b>a && b>c){
    	 System.out.println("the maximum  value is:"+b);
    	
    }
    else  {
    	 System.out.println(" the maximum value is:"+c);
    }
    
	}

}
