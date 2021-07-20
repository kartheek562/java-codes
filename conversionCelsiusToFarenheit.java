package LEARNING.ADD.OPERATOR;
import java.util.*;

public class converstionCtoF {
	public static void main(String[] args) {
	double c,F;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the temp in celsius:");
	c=sc.nextDouble();
	double f=(c*9/5)+32;
	System.out.println("the farenheit value is:"+f);
	System.out.println("enter the  temp in faren heit:");
	F=sc.nextDouble();
	double C=(F-32)*5/9;
	System.out.println("the celsius value is:"+C);
	
	
	

}

}
