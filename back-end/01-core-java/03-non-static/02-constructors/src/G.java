class G
{
	G()
	{
		System.out.println("G()");
	}
	
	public static void main(String[] args)
	{
		G g1 = new G(90);
		System.out.println("done");
	}
}

//If the user only keeps the custom constructors then we should call only those  constructors according to the argument. (not the default constructor) default constructor only applicable whenever there are no exlicit constructors are exist in the class.