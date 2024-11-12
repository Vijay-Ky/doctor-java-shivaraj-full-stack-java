class C 
{
	static int i = 10;
	
	static
	{
		System.out.println("from C-SIB1");
	}
	
	static void test()
	{
		System.out.println("from C-test()");
	}
	
	static
	{
		System.out.println("from C-SIB2");
	}
}
class D
{
	static
	{
		System.out.println("from D-SIB1");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("D-main-begin");
		C.test();
		C.test();
		System.out.println(C.i);
		System.out.println(C.i);
		System.out.println("D-main-end");
	}	
	
	static
	{
		System.out.println("from D-SIB2");
	}
}

