import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter one int value");
		int i = sc.nextInt();
		//23. after the execution of the nextInt() method cursor stays in the same line. once we hit the 'Enter key' that Enter key character will be completely cosumed by the nextLine() method immediately.
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