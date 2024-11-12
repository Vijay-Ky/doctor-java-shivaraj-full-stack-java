import java.util.Scanner;
class J
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter one int value");
		int i = sc.nextInt();
		
		//24. Solution to this problem is, we should include another nextLine() to consume all the blank spaces which after the previous input value, this technic will make way to get the next Line of input from another nextLine method without skipping it.
		sc.nextLine();//this will consume the entire blank spaces after the previous input value.
		
		System.out.println("enter a sentence value");
		String j = sc.nextLine();//this one we can use it to read the next entire line

		
		System.out.println("enter one float value");
		float k = sc.nextFloat();
		
		System.out.println("----------------------------");
		
		System.out.println("int: " + i);
		System.out.println("nextLine: " + j);
		System.out.println("float: " + k);
	}
}