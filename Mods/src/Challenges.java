import java.util.Scanner;
public class Challenges
	{
		public static void main(String[] args)
			{
				EvenOrOdd();
				Year();
				Array();
				FizzBuzz();
			}
		public static void EvenOrOdd()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Type a number, even or odd.");
		int nums = userInput.nextInt();
		if(nums % 2 == 0)
			{
			System.out.println("This number is even");
			}
			else if (nums % 2 == 1)
				{
				System.out.println("This number is odd");
				}	
			}
		public static void Year()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Type a year");
		int year = userInput.nextInt();
		if(year % 4 == 0)
			{
			System.out.println("This is a leap year");
			}
		else if (year % 1 == 0)
			{
			System.out.println("This is not a leap year");
			}
		}
	public static void Array()
	{
		int Array [] = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
		for (int i = 0; i<Array.length; i++)
			{
			if ( i % 3 == 0)
				{
				System.out.println(Array[i]);
				}
			}
	}
	
	public static void FizzBuzz()
	{
	int FizzBuzz [] = {};
	for(int i=1; i <101; i++)
		{	
				
				if(i%3 == 0 & i%5 == 0)
				{
				System.out.println("FizzBuzz");
				}
				else if (i % 3 == 0)
				{
				System.out.println("Fizz");
				}
				else if(i % 5 == 0)
				{
				System.out.println("Buzz");
				}
				
				else 
					{
					System.out.println(i);
					}
		}
	}
}


				

	
