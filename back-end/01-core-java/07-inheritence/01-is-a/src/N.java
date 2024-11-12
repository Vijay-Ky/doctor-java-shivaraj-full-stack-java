class M 
{
	M()
	{
		//super();
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		//super();
		System.out.println("N()");
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("from N main");
	}
}
/*
1. In each and every constructor body as a first statement compiler will be keeping `super();` even though we do not keep that statement explicitely.
2. if you are keeping `super();` explicitely then compiler would not keep that statement.
2. `super();` will calling the super class no-arg constructor.
3. If a class is not extending any other class, then it is implicitely extending Object class.
*/