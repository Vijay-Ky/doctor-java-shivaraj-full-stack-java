class V
{
	int i;

	static V test()
	{
		return new V();//V v1 = new V();//return v1;//new V();
	}

	public static void main(String[] args) 
	{
		V v1 = test();
		System.out.println(v1.i);
	}
}
//20. while returning a value in a method we can create the object and return.
//21. if the return type is class type then, it can accept a reference of that class type or it can accept the object of that class type itself.