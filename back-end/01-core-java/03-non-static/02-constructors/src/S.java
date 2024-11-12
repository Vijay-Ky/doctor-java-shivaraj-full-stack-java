class S
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		S();
		System.out.println("S(int)");
	}
	public static void main(String[]args)
	{
		S obj1 = new S();
		System.out.println("-----");
		S obj2 = new S(10);
		System.out.println("-----");
	}
}
//we can able to call a method by its name directly but not the constructor by its name. constructor can be only invoked while creating the object, by using `this` calling statement, or using `super` calling statment normally. NOT BY THE NAME OF THE CONSTRUCTOR.
