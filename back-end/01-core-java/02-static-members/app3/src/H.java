class H 
{
	static 
	{
		System.out.println("H-SIB1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("H-main-begin");
		System.out.println(E.x);
		F.test();
		System.out.println(G.b);
		System.out.println("H-main-end");
	}
}
