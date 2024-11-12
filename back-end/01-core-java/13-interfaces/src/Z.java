interface Z
{
	public default void test1()
	{
	}

	public default void test2()
	{
	}
}
//- in java JDK 1.8 they have re-engineerired the interface to have any no. of static methods and default methods which is implemented.
//- Reason: To avoid interface to completely depend upon the implenting classes. and interface can have its own implemented methods without the dependency of the implentation classes.