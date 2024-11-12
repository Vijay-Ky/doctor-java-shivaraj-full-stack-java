class L
{
	static int x = 100;
	
	public static void main(String[] args) 
	{
		System.out.println(x);
		int x = 20;
		System.out.println(x);
		L.x = 200;
		System.out.println(L.x);
	}
}
