interface K
{
    void test1();
}
class L implements K
{
    public void test1()
    {
        System.out.println("from L.test1()");
    }

    public static void main(String[] args)
    {
        //for the interface we cant create an object
        //K obj1 = new K();
		K obj1 = null;
        //K obj2 = new L();
		//obj2.test1();
		//L l1 = new L();
		//l1.test1();
        System.out.println("done");
    }
}