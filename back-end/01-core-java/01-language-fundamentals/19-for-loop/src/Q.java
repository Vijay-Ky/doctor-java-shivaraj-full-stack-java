class Q
{
	public static void main(String[] args)
	{
		int i;
		for(System.out.println("i-INITIALIZER"), i = 0, System.out.println("INITIALIZER");
		i < 5;
		System.out.println("I-INCREMENT"), i++, System.out.println("INCREMENT"))
		{
			System.out.println("BODY");
		}
	}
}