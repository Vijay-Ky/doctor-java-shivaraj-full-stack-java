class M15
{
	static void test1(B b1)
	{
		System.out.println("from test(B)");
	}
	public static void main(String[] args)
	{
		A a1 = new B();
		//test1(a1);
		test1((B)a1);
		System.out.println("done");
	}
}