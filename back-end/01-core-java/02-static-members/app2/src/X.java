class X
{
	//SIB(Static Initializer/Initialization Block)
	static 
	{
		System.out.println("X-SIB1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("X-main");
	}
	
	static 
	{
		System.out.println("X-SIB2");
	}
}
