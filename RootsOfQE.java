//program to calculate roots of the quadratic equations

package LEARNING.ADD.OPERATOR;
import java.util.Scanner;

public class quadratic {
	public static void main(String[]args) {
		double a,b,c;
		double root1,root2;
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value :");
		a=sc.nextDouble();
		System.out.println("enter the b value:");
		b=sc.nextDouble();
		System.out.println("enter the c value:");
		c=sc.nextDouble();
		double determinant =b*b-4*b*c;
		if (determinant>0){
		root1=-b+Math.sqrt(determinant)/(2*a*c);
		root2=-b-Math.sqrt(determinant)/(2*a*c);
		System.out.format("root1=%.2f and root2=%.2f",root1,root2);
	}
		else if(determinant==0)
		{
			root1=root2=-b/(2*a);
			System.out.format("root1=root2=%.2f",root1 );
			
		}
		else
	 {
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-determinant)/(2*a);
			System.out.format("root1=%.2f +%.2fi",real,imaginary);
			System.out.format("\nroot2=%.2f-%.2fi", real,imaginary);
		}
}
}
