interface B
{
	//By default interface variables are PUBLIC STATIC FINAL, if you are not giving all these   modifiers compiler only will be adding this modifiers.

    int i = 0;
	static int j = 10;
	public int k = 10;
	final int l = 10;

//Methods are by default PUBLIC, ABSTRACT
//generally interface will not allow implemented normal methods.
	void test1();
	public void test2();
	abstract void test3();
	public abstract void test4();
	abstract public void test5();
}