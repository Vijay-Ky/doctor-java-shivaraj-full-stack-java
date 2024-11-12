class S
{
	static int test1()
	{
		System.out.println("from test1()");
		return 100;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(test1() + test1() + test1());
	}
}
