package app1;

public class A
{
    private String name;
    private int age;
    private double salary;
    private String address;

//    public A(String name, int age, double salary, String address)
//    {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.address = address;
//    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}

class B
{
    public static void main(String[] args)
    {
        A a1 = new A();
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getSalary());
        System.out.println(a1.getAddress());

        a1.setName("Johny");
        a1.setAge(22);
        a1.setAge(40000);
        a1.setAddress("BTM");

        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getSalary());
        System.out.println(a1.getAddress());
    }
}
