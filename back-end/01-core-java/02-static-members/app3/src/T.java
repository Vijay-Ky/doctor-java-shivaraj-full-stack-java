class T
{
	static int i = test();
	
	public static int test()
	{
		System.out.println("test:" + i);
		i = 99;
		main(null);			
		return 10;
	}

	public static void main(String[] args)			
	{
		System.out.println("main:" + i);
		i = 33;
	}
}
