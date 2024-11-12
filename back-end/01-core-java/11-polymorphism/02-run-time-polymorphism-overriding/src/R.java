class Q
{
	public void test1()
	{
		System.out.println("from test1-Q");
	}
}
class R extends Q
{
	//If you have public in the super class then definately you must go for public in the sub-class. there is no other choice, since public is the wider most.
	public void test1()
	{
		System.out.println("from test1-R");
	}

	public static void main(String[] args) 
	{
		R obj1 = new R();
		obj1.test1();
		System.out.println("done");
	}
}
