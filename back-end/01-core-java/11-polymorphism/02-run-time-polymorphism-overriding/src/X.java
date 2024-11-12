class W
{
	public static void test1()
	{
		System.out.println("from test1.W");
	}
}
class X extends W
{
	public static void test1()
	{
		System.out.println("from test1.X");
	}

	public static void main(String[] args) 
	{
		//In case of super class reference and sub-class object with static methods then reference matters not the object.
		//In case of super class reference and sub-class object with non-static methods then object matters not the reference.
		W obj1 = new X();
		obj1.test1();
		System.out.println("done");
	}
}
