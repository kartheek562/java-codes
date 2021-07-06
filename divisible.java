//program to check whether the  number is divisible by given numbers

public class divisible {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the a value:");
		 a=sc.nextInt();
		 System.out.println("enter the b value:");
		 b=sc.nextInt();
		 System.out.println("enter the c value:");
		 c=sc.nextInt();
		 if(a%b==0 && a%c==0) {
			 System.out.println("divisible by both b & c");
		 }
		 else if (a%b==0 && a%c!=0) {
			 System.out.println("divisible by b only");
		 }
		 else if (a%b!=0 && a%c==0) {
			 System.out.println("divisible by c only");
		 }
		 else {
			 System.out.println("not divisible by both b & c");
		 }

	}

}
