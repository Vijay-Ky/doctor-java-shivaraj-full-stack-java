class DriverClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from Driver Class");
	}
	
	static void test1()
	{
		System.out.println("from DriverClass test1()");
	}
}
class Derived1 extends DriverClass
{
	static int i;
	static
	{
		Derived1.main(null);
		//DriverClass.main(null);
	}
	public static void main(String[] args) 
	{
		Derived1.test1();
		//Derived1.main(null);
		System.out.println("Hello from Derived1 Class");
	}
}
class Derived2 extends DriverClass
{
	static int j;
	static
	{
		Derived2.main(null);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello from Derived2 Class");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("MainClass begin");
		System.out.println(Derived1.i);
		System.out.println(Derived2.j);
		System.out.println("MainClass end");
	}
}
/*
main method is not going to be inherited to the sub-class event though we are using the extends keyword. other static method would be inherited as usual.
*/