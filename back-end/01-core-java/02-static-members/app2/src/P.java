class P
{
	static int test1()
	{
		return 10;
	}
	
	static int i = 0; 
	static int j = test2() + (test1() * 2);
	
	public static void main(String[] args) 
	{
		System.out.println("from main: " + i + ", " + j);
	}
	
	static int test2()
	{
		return 2;
	}
}
