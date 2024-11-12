class M17
{
	static B test()
	{
		return new D();
	}
	public static void main(String[] args)
	{
		D d1 = (D)test();
		System.out.println("done");
	}
}