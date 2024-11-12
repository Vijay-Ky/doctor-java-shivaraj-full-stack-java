class Demo2 
{
	public static void main(String[] args) 
	{
		int firstNum = -100000;
		int secondNum = -20000;
		int thirdNum = -300000;
		
		int minimum = firstNum < secondNum ?
			(firstNum < thirdNum ? firstNum : thirdNum)
			: (secondNum < thirdNum ? secondNum : thirdNum);	
		
		System.out.println("The minimun number is: " + minimum);
		
		/*int minimum = firstNum < secondNum ?
			(firstNum < thirdNum ? firstNum < fourth ? firstNum : fourth)
			: (secondNum < thirdNum ? secondNum < fourtNum ? secondNum : fourthNum);	*/
	}
}
