class B
{
	B()
	{
		System.out.println("B()");
	}
	
	public static void main(String[] args)
	{	
		B b1 = new B();
		System.out.println("-----");
		B b2 = new B();
		System.out.println("-----");
	}
}

/*
1. Constructors are used to initialize the objects.
2. Constructors are not a usual methods. they dont have the return type.
3. Constructors name must be same as class name(case sensitive).
4. In each and every class there will be a default constructor, which is a no-arg constructor. that no-arg constructor will be kept by the compiler at the time of compilation.
5. In the default constructor there will no printable statemenets. thats why we do not get the output from that constructor.
6. At the time of creating the objects, constructors will be exected accordigly.
7. we can call a constructor any no. of times.
*/