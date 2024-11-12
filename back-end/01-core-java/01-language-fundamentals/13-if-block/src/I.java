class I
{
	public static void main(String[] args)
	{
		boolean flag = !(!(!false != !true)); //!(!false); //!false; //
		if(flag)
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
	}
}