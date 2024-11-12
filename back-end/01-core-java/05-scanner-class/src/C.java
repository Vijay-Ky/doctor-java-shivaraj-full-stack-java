import java.util.Scanner;
class C
{
	public static void main(String[] args) 
	{
		System.out.println("enter one int value");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();//sc.nextLine();
		System.out.println("The Input that you have entered: " + i);
	}
}
/*
- in case of nextInt it will be reading the next complete token or input in the form of int value 
*/
