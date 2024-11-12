class G
{
	static
	{
		System.out.println("from SIB");
		i = 10;
	}

	static final int i = test();

	public static void main(String[] args)
	{
		System.out.println(i);
	}

	public static int test()
	{
		System.out.println("from test()");
		return 10;
	}
}
