class M 
{
	public static void main(String[] args) 
	{
		byte b = 10;
		//implicite upcasting
		int i = b;
		//explicite upcasting (not neccessary)
		int j = (int)b;
		double d = (double)i;
		System.out.println("done");
	}
}
