class T
{
	static int i = test1();
	static int j;
	
	static int test1()
	{
		System.out.println("from test1()");
		return j;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i + j + test1() + test1());
	}
}
