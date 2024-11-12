class S
{
	static int i;
	static int j = i = 20;//compound assignment
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
