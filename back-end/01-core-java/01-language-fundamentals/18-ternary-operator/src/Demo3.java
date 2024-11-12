class Demo3
{
    public static void main(String[] args) 
    {
        int firstNum = -100000;
        int secondNum = -20000;
        int thirdNum = -300000;
        int fourthNum = -50000;
        
        int minimum = firstNum < secondNum ?
            (firstNum < thirdNum ?
                (firstNum < fourthNum ? firstNum : fourthNum)
                : (thirdNum < fourthNum ? thirdNum : fourthNum))
            : (secondNum < thirdNum ?
                (secondNum < fourthNum ? secondNum : fourthNum)
                : (thirdNum < fourthNum ? thirdNum : fourthNum));
        
        System.out.println("The minimum number is: " + minimum);
    }
}
