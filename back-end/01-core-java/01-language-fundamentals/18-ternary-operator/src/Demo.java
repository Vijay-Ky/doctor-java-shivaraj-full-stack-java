class Demo 
{
	public static void main(String[] args) 
	{
		int firstNum = -10;
		int secondNum = -80;
		int thirdNum = -40;
		
		if ((firstNum < secondNum) && (firstNum < thirdNum))
		{
			System.out.println("The Number " + firstNum + " is the minimum");
		}
		else if((secondNum < thirdNum))
		{
			System.out.println("The Number " + secondNum + " is the minimum");
		}
		else
		{
			System.out.println("The Number " + thirdNum + " is the minimum");
		}
	}
}
