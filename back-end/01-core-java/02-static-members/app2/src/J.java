class J
{
	static int i;
	static int j = i++ + i + ++i + i; 
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
