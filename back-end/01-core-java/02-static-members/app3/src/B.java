class A
{
	static int i = 10;
	
	static 
	{
		System.out.println("A-SIB");
	}
	
	static void test() 
	{
		System.out.println("A-test()");
	}
}
class B
{
	static 
	{
		System.out.println("B-SIB");
	}
	
	public static void main(String[] args)
	{
		System.out.println("B-main-begin");
		System.out.println(A.i);
		A.test();
		System.out.println("B-main-end");
	}
}
