class M23
{
	public static void main(String[] args)
	{
		A a1 = new B();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
	}
}
//in order to avoid ClassCastException we take a suggestion from the instanceof operator.