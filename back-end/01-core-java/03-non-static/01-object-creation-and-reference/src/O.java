class O 
{
	int i;
	
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2;
		o2 = o1;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o2.i = 20;
		System.out.println(o1.i);
		System.out.println(o2.i);
	}
}
//One object can be pointed by any number of references, changes to one reference affecting all the references which are pointing to the same object. by using any reference you can make the modification.