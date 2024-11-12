class R
{
   final int i;

   R()
   {
		i = 10;
		System.out.println("R(): " + i);
   }

   R(int j, int k)
   {
	   i = k;
	   System.out.println("R(int, int): " + i);
   }
	
	public static void main(String[] args) 
	{
		R r1 = new R();
		R r2 = new R(10, 20);
		System.out.println("done");
	}

}
