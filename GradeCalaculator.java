//program to calculate grade using marks

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		int marks;
		System.out.println("enter the marks:");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>90 && marks<100) {
			System.out.println("S grade");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("A grade");
			
		}
		else if(marks>70 && marks<=80) {
			System.out.println("B grade");
		}
		else if(marks>60 && marks<=70) {
			System.out.println("C grade");
			}
		else if(marks>50 && marks<=60) {
			System.out.println("D grade");
		}
		else 
		{
			System.out.println("F grade");
	}
	}


}
