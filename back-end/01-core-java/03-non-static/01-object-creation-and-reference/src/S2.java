class S2
{
	int i;

	static void test1(S2 obj)
	{
		obj.i = 20;
	}
	
	void test2(S2 obj)
	{
		obj.i = 30;
	}

	public static void main(String[] args) 
	{
		S2 s1 = new S2();
		s1.i = 10;
		System.out.println("before calling test1(obj): " + s1.i);
		s1.test1(s1);
		System.out.println("after calling test1(obj): " + s1.i);
		System.out.println("before calling test2(obj): " + s1.i);
		s1.test2(s1);
		System.out.println("after calling test2(obj): " + s1.i);
	}
}
