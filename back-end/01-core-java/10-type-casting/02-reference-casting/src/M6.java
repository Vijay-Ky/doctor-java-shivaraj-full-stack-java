class M6 
{
	public static void main(String[] args) 
	{
		//Object obj = new D();
		A a1 = new B();//a1 = (A) new B(); --> auto-upcasting
		B b1 = new C();
		C c1 = new D();
		System.out.println("done");
	}
}
//if you are supplying sub type to the super type then auto-upcating will happen
//type promotion
//super class reference can hold sub-class object