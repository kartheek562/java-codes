//program to find odd or even

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int number;
		System.out.println("enter the number :");
		Scanner sc=new Scanner(System.in);
		number =sc.nextInt();
		if(number%2==0) {
			System.out.println("it is a even number");
		}
		else {
			System.out.println("it is a odd number");
		}
		
	}

}
