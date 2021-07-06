//program to calculate area and perimeter of the rectangle

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,area,perimeter;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of the rectangle:");
		a= sc.nextInt();
		System.out.println("enter the width of the rectangle:");
		b= sc.nextInt();
		area =2*(a+b);
		System.out.println("the area of the rectangle is:"+area);
		perimeter=a*b;
		System.out.println("the perimeter of the rectangle is:"+perimeter);
		
	}

}
