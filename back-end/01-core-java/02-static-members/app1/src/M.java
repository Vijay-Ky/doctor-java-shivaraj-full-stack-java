class M 
{
	static int x = 100;
	
	public static void main(String[] args) 
	{
		System.out.println(x);
		int x = 10;
		System.out.println(x);
		System.out.println(M.x);
		x = 20;
		System.out.println(x);
		System.out.println(M.x);
		M.x = 200;
		System.out.println(x);
		System.out.println(M.x);
	}
}
