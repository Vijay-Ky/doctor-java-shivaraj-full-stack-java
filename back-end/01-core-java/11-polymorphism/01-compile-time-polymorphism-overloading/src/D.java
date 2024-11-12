class D 
{
	static String test()
	{
		System.out.println("test(int)");
		return "abc";
	}

	static String test()
	{
		System.out.println("test(String)");
		return "abc";
	}

	public static void main(String[] args) 
	{
		D.test();
		D.test();
		System.out.println("done");
	}
}
