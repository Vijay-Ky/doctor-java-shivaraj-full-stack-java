class Y 
{
	static 
	{
		System.out.println("Y-SIB");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Y-main");
	}
	
	static void test()
	{
		System.out.println("from-Y-test()");
	}
}

class Z
{
	static 
	{
		System.out.println("Z-SIB");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Z-main-begin");
		Y.test();
		Y.main(null);
		Y.main(args);
		System.out.println("Z-main-end");
	}
}
