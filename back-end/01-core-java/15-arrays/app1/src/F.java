//How to the elements of an array?
public class F
{
	public static void main(String []args)
	{
		int x[] = new int[4];
		System.out.println(x.length);
		System.out.println("------");
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("------");
		for(int i: x)
		{
			System.out.println(x[i]);
		}
	}
}
