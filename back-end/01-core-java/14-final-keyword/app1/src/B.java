class B
{
    public static void main(String[] args)
    {
        final int i;
        i = 10;
        System.out.println(i);
		i = 20;
    }
}
/*
5. local variables will not get a default value.
6. for the final variables only first time initialization is possible.
   i,e re-initialization is not possible for a final variable.
7. In case of local final variables declartion can be in one line and intialization can be in another line.
*/