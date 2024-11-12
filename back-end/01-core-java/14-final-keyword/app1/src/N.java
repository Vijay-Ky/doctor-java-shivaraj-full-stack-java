class N
{
   // final int i;
    final int i = 10;

    public static void main(String[] args)
    {
        N n1 = new N();
        n1 = new N();
        System.out.println("done: " + n1.i);
    }
}
//12. global variables can be declared as final*.
//13. global final variable with final will not be having a default value.