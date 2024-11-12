class P 
{
	int i;
	
	static void test(P obj)
	{
		System.out.println("from test begin: " + obj.i);
		obj.i = 20;
		System.out.println("from test end: " + obj.i);
	}
	
	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println("from main begin: " + p1.i);
		p1.i = 10;
		test(p1);
		System.out.println("from main end: " + p1.i);
	}
}
