class O
{
	void test1()
	{
		System.out.println("from test1-O");
	}
}
class P extends O
{
	//Access modifiers can be same or wider
	private void test1()
	{
		System.out.println("from test1-P");
	}

	public static void main(String[] args) 
	{
		P obj1 = new P();
		obj1.test1();
		System.out.println("done");
	}
}
