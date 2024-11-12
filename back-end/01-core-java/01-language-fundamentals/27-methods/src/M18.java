class M18
{
	public static void main(String[] args)
	{
		System.out.println("browser begin");
		website();
		website();
		System.out.println("brower end");
	}
	static void website()
	{
		System.out.println("website begin");
		int age = 17;
		if (age == 18 || age > 18)
		{
			System.out.println("continue website");
		}
		else
		{
			System.out.println("dont have the eligibility!");
			return;
		}
	}
}