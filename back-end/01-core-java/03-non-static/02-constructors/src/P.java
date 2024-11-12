class P
{
	P()
	{
		this(10, 20);
		System.out.println("P()");
	}
	P(int i, int j)
	{
		System.out.println("P(int, int)");
	}
	public static void main(String[] args)
	{
		P p1 = new P();
		System.out.println("-----");
		P p2 = new P(1, 2);
		System.out.println("-----");
	}
}
//`this` calling statement will be always calling the current class constructor, before the execution of the constructor which contains the this calling statement.