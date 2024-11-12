class M34
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(test() + test() + test() + test2());
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
	
	static String test2()
	{
		System.out.println("from test2");
		return "100";
	}
}
