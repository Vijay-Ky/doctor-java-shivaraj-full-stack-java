class M25
{
	public static void test(Company cmp)
	{
		if(cmp instanceof Company)
		{
			if(cmp instanceof Company)
			{
				Company obj = (Company) cmp;
				System.out.println("casting to Company");
			}

			if(cmp instanceof ChiefExecutiveOfficer)
			{
				ChiefExecutiveOfficer obj = (ChiefExecutiveOfficer) cmp;
				System.out.println("casting to ChiefExecutiveOfficer");
			}

			if(cmp instanceof ChiefTechnologyOfficer)
			{
				System.out.println("casting to ChiefTechnologyOfficer");
				ChiefTechnologyOfficer obj = (ChiefTechnologyOfficer) cmp;
			}

			if(cmp instanceof Manager)
			{
				System.out.println("casting to Manager");
				Manager obj = (Manager) cmp;
			}
			if(cmp instanceof Developer)
			{
				System.out.println("casting to Developer");
				Developer obj = (Developer) cmp;
			}
		}
	}

	public static void main(String[] args) 
	{
		Company obj1 = new Company();
		test(obj1);
		System.out.println("-------------------------");
		Company obj2 = new ChiefExecutiveOfficer();
		test(obj2);
		System.out.println("-------------------------");
		Company obj3 = new ChiefTechnologyOfficer();
		test(obj3);
		System.out.println("-------------------------");
		Company obj4 = new Manager();
		test(obj4);
		System.out.println("-------------------------");
		Company obj5 = new Developer();
		test(obj5);
		System.out.println("-------------------------");
	}
}
