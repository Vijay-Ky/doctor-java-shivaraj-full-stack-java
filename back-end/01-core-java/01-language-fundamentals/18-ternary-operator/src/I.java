class I
{
	public static void main(String[] args) 
	{
		int firstNum = -30;
		int secondNum = -100;
		int thirdNum = -300;
		int fourthNum = -1000;
		
		if((firstNum == secondNum && thirdNum == fourthNum) || firstNum == secondNum || secondNum == thirdNum || thirdNum == fourthNum || firstNum == thirdNum || firstNum == fourthNum || secondNum == fourthNum)
		{
			System.out.println("Cant find minimun here! some numbers are equal, change the values and try again!");
		}
		else
		{

			int min = (firstNum < secondNum && firstNum < thirdNum && firstNum < fourthNum) ?
			firstNum : (secondNum < thirdNum && secondNum < fourthNum) ?
			secondNum : (thirdNum < fourthNum) ?
			thirdNum : fourthNum;
			System.out.println(min);
		}
	}
}
