abstract class X
{
	int i = 10;
	
	static
	{
		System.out.println("X-SIB");
	}
}
class Z extends X 
{
	public static void main(String[] args) 
	{
		Z z1 = new Z();
		System.out.println(z1.i);
	}
}
