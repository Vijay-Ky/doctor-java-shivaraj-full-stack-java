class M33
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
	}
	static String test()
	{
		System.out.println("from test begin");
		if (false)
		{
			return "100";
		}
		System.out.println("from test end");
		return "200";
	}
}
