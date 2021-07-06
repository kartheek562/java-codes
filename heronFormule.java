//program to calculate area of triangle using herons formulae

package LEARNING.ADD.OPERATOR;
import java.util.Scanner;
public class herons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c ,s;
		double area;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value");
		a=sc.nextInt();
		System.out.println("enter the b value");
		b=sc.nextInt();
		System.out.println("enter the c value");
		c=sc.nextInt();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("the area of triangle using herons formulae:"+area);
		
		

	}

}
