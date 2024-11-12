class S
{
	static void test(int i)
	{
		System.out.println("test(int): " + i);
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		double d = 10.0;
		test((short)(double)d);
		System.out.println("done");
	}
}
