class P
{
	static int i = test();
	static int j = test();
	
	static int test()
	{
		System.out.println("from test()");
		return 10;
	}
	
	static  
	{
		System.out.println("SIB1");
	}
		
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		test();
		System.out.println("done");
	}
	
	static  
	{
		System.out.println("SIB2");
	}
}
