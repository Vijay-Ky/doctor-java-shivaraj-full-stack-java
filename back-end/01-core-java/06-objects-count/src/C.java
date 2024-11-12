class C 
{
	int counter;

	C()
	{
		counter++;
	}

	public static void main(String[] args) 
	{
		C obj1 = new C();
		System.out.println("A-----------------A: " + obj1.counter);
		C obj2 = new C();
		System.out.println("B-----------------B: " + obj2.counter);
		C obj3 = new C();
		System.out.println("C-----------------C: " + obj3.counter);
		C obj4 = new C();
		System.out.println("D-----------------D: " + obj4.counter);
		C obj5 = new C();
		System.out.println("D-----------------D: " + obj5.counter);
	}
}
/*
3. same copy of static members will be available for all the objects of that class.
   but in case of non-static member for each object a seperate copy of non-static member will be loaded each time with the default value, unlike static which the same copy for all the objects changes would be happening for the same copy(only one copy) of the static member.
4. each and every static member of a class is part each and every object of that class.
*/