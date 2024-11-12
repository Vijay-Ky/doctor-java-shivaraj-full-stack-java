class O 
{
	static int test1()
	{
		return 100;
	}
	
	static int i = test1() + test2(); 
	
	public static void main(String[] args) 
	{
		System.out.println("from main: " + i);
	}
	
	static int test2()
	{
		return 100;
	}
}
