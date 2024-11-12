class Q
{
	static int test1()
	{
		System.out.println("from test1()");
		return 100;
	}
	
	static int i = 10; 
	static int j = test1();
	
	public static void main(String[] args) 
	{
		System.out.println("from main: " + test1() + ", " + j + test1() + i);
	}
}
