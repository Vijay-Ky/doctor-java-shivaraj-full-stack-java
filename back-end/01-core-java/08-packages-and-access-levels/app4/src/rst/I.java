package rst;
class I extends H
{
	public static void main(String[] args)
	{
		G ob = new G();
		System.out.println(ob.j);
		System.out.println(ob.k);
		
		H obj = new H();
		System.out.println(obj.j);
		System.out.println(obj.k);

		I obj2 = new I();
		System.out.println(obj2.j);
		System.out.println(obj2.k);
	}
}