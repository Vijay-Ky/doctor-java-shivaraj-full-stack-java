class A
{
    public static void main(String[] args)
    {
		//local variables cant have an access specifier. access specifiers will not be applicable to local variables.
        //private int i = 10;
        int i = 10;
		//if any variable is declared as final. The value for that variable will be fixed it cant be changed further. if you try to change you will get error.
		final int j = 20;

        System.out.println(i);
        System.out.println(j);

        i = 15;
        j = 25;
    }
}
