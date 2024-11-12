class X
{
	public static void main(String[] args) 
	{
		double i = 0.0, j = 0.0;
		for (i = 0.0; i <= 10.5; )
		{
			System.out.println("iteration number: " + i);
			for (j = 4.2; j <= 4.5; j += 0.1)
			{
				System.out.println(i+":"+j);
			}
			i++;
			System.out.println(i + ":" + j);
			System.out.println();
		}
		//System.out.println(i + "::::" + j);
	}
}
