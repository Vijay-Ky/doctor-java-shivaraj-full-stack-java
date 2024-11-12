class N 
{
	static int i = 10;
	
	static 
	{
		j = i;	
	}
	
	static int j;
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
