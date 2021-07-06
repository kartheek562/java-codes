//program for calculate modulus in maths

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		int num;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		num =sc.nextInt();
		if(num<0) {
			num= num*-1;
			
		}
		System.out.println("the modulos of the given number is :"+num);

	}

}
