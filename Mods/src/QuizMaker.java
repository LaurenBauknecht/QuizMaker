import java.util.Scanner;
public class QuizMaker
{
	public static void main(String[] args)
			{
				Quiz();
				
			}

	public static void Quiz()
		{
		System.out.println("How many questions would you like to answer?");
		Scanner userInput = new Scanner (System.in);
		int number = userInput.nextInt();
			for(int i = 0; i < number; i++)
			{
		int randomNumber1 = (int)(Math.random() *40);
		int randomNumber2 = (int)(Math.random() *10);
		System.out.println("What is " +randomNumber1+ " % " +randomNumber2+ " ?");
		Scanner userInput1 = new Scanner (System.in);
		int num = userInput1.nextInt();
		System.out.println();
			{
			if(randomNumber1 % randomNumber2 == num)
				{
				System.out.println("You are correct");
				}
			else
				{
				System.out.println("You are incorrect");
				}
			
			}
			
			}
				int randomNumber = (int)(Math.random()*40 + 10);
				System.out.println("What is " +randomNumber+ "%" +randomNumber+ " ?");
				Scanner userInput2 = new Scanner (System.in);
				int num = userInput2.nextInt();
				System.out.println();
					{
					if(randomNumber % randomNumber == num)
						{
						System.out.println("You are correct");
						}
					else
						{
						System.out.println("You are incorrect");
						}
					}
					
					
		}
}

		