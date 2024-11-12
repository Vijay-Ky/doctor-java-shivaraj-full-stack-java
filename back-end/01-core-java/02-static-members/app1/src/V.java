class V
{
	public static void main(String[] args) 
	{
		int i;
		int j = i + (i = 20);
		System.out.println(i);
		System.out.println(j);
	}
}
