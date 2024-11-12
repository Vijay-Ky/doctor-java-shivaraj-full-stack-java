class A
{
	public static void main(String[] args) 
	{
		//simply printing main method argument
		//args is the argument to main method
		//array address will be printing 
		//we dont care about the address usually
		System.out.println("Hello World!: " + args);
	}
}
//if in case we dont supply any arguments at the time of running a class, then the JVM is going to create an empty String[] Object and send it as an argument to the main method.

