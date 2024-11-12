class B 
{
	static void test()
	{
		System.out.println("test()");
	}

	static int test(int i)
	{
		System.out.println("test(int)");
		return 10;
	}

	static String test(int i, int j)
	{
		System.out.println("test(int, int)");
		return "abc";
	}

	static void test(int i, int j, int k)
	{
		System.out.println("test(int, int, int)");
	}

	public static void main(String[] args) 
	{
		B.test();
		B.test(10);
		B.test(10, 20);
		B.test(10, 20, 30);
		System.out.println("done");
	}
}
