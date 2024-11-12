class I
{
	static int i = (i = 0) + (i = 2) + (i += 2);
	
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
