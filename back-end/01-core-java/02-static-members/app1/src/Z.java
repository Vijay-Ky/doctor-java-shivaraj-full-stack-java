class Z
{
	static int i;
	static int j = i + i++ + i + --i + i;//0 + 0 + 1 + 0 + 0
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
