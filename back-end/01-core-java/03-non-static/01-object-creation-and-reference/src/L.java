class L
{
	void test1()
	{
		System.out.println("from test1()");
	}
	
	static void test2() 
	{
		L obj = new L();
		obj.test1();
		System.out.println("from test2()");
	}
}
