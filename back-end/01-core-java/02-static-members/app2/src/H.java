class H
{
	static int i = (i = 0) + (i = 2) + ++i;
	
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
