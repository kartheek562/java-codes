//program to calculate sum of squares

package LEARNING.ADD.OPERATOR;

import java.util.Scanner;

public class sumofsquare {

	public static void main(String[] args) {
		int  n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter N value:");
		n =  sc.nextInt();
		int i=1;
		int sum = 0;
		while(i<=n)
		{
			sum = sum+(i*i);
			i=i+1;
			
		}
        System.out.println(sum);
	}

}
