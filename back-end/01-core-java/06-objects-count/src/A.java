class A 
{
	static int x;

	A()
	{
		x += 10;
	}

	{
		x += 20;
	}

	void test1()
	{
		x += 30;
	}

	static void test2()
	{
		x += 40;
	}

	public static void main(String[] args) 
	{
		System.out.println("A: " + x);
		A a1 = new A();
		System.out.println("B: " + x);
		a1.test1();
		System.out.println("C: " + x);
		a1.test2();
		System.out.println("D: " + x);
	}
}
/*
Objects Count
-------------
1. All the static members of a class are part of each and every objects of that particular class.
2. All those static members can be accessed by the Object reference of that class.
*/