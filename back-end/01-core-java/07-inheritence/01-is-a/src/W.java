class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class W extends A 
{
	public static void main(String[] args) 
	{
		//W w1 = new W();
		System.out.println("done");
	}
}
/*
Note: if you are not creating an object in the sub-class then it will not invoke the default constructor which is added by the compiler implicitely, but definately the default constructor will be considered for the compilation. and if there is no-arg constructor available in the super-class which is invoked by the sub-class default constructor then definately we get CE.


*/