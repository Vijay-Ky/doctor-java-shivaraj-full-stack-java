package pack1;
class I
{
	int i;

	void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) 
	{
		I obj = new I();
		System.out.println(obj.i);
		obj.test();
	}	
}
//19. if you are declaring any access specifiers then by default compiler will considering that member as with the default access specifier.
