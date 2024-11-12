package pack1;
class J
{
	int i;

	void test()
	{
		System.out.println("from test()");
	}
}
class K 
{
	public static void main(String[] args) 
	{
		J obj = new J();
		System.out.println(obj.i);
		obj.test();
	}	
}
//20. default member can be used even out-side of the class as well within the same package.