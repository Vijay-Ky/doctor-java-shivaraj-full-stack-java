import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("enter one double value");
		Scanner sc = new Scanner(System.in);
		//double i = 100.0D;
		//System.out.println(i);
		//if you supply int value while using nextDouble() method then int will be automatically upcasted to double. Ex. 10 becomes 10.0 
		double d = sc.nextDouble();
		System.out.println(d);
	}
}
