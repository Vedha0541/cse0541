import java.util.*;
public class GuessingGame
{
	public static void main(String args[])
	{
		String secretCode="53840";
		int maxGuess=3;
		int correctPosition=0;
		int sumOfDigits=0;
		String userCode;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<maxGuess;i++)
		{
			System.out.println("Enter a guess");
			userCode=sc.nextLine();
			if(userCode.length()!=5)
			{
			System.out.println("Invalid. Guess a 5 dgit number");
			continue;
			}
			for(int j=0;j<userCode.length();j++)
			{
				if(userCode.charAt(j)==secretCode.charAt(j))
				{
					correctPosition++;
					sumOfDigits+=Integer.parseInt(String.valueOf(userCode.charAt(j)));
				}
			}
		
			if(userCode.equals(secretCode))
			{
				System.out.println("Congracts you guessed it right");
			}
			System.out.println("The number of digits in corect position and sum of those are:"+sumOfDigits+" "+correctPosition);														
		
		try
		{
			if(i==maxGuess)
			{
				throw new NumberFormatException();
			}
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("you ran out of attempts");
		}
		}
	}
}