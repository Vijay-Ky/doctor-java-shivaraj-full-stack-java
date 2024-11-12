class M21
{
	public static void main(String[] args)
	{
		A a1 = new C();
		System.out.println(11);
		B b1 = (B)a1;
		System.out.println(22);
		C c1 = (C)a1;
		System.out.println(33);
		D d1 = (D)a1;
		System.out.println(44);
	}
}
//what is ClassCastException? how it occurs?
//Ans. if we try to downcast to the type which is unknown by the reference then we get this Exception.