class Q
{
	final int i;
	
	void test()
	{
		i = 10;
	}
}
//14. final global varialbe must be initialized either in the constructor or in the IIB otherwise you would error. i,e before object creation if finalized the final global varialbe must get a value either in constructor or in iib