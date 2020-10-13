package task2;

/**********************************************
Workshop 1 Task2
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:26 September 2020
**********************************************/
import java.util.Random;  

public class Craps
{

    static int dice1,dice2,total,sum;
    
    // function for rolling two dice
	public static void  rolling()
	{
	
	  //generating random numbers for dice 1
	  dice1 = (int) ((Math.random() * 6) + 1);
	  
	//generating random numbers for dice 2
	  dice2 = (int) ((Math.random() * 6) + 1);
	}
	
	// function for adding the random numbers generated
	public static int add()
	{
		int result;
	    result = dice1 + dice2;
	    return result;
	}

	// main function
	public static void main(String[] args) 
	{
		Random rand = new Random(System.currentTimeMillis());
		do
		{
			rolling();
			sum = add();
			
			System.out.println("You rolled " + dice1 + "+" +dice2+ "=" + sum);
			if (sum == 7 || sum == 11)
			{
				System.out.println("Congratulations You won");
			}
			else if (sum == 2 || sum == 3 || sum == 12)
		    {
			     System.out.println("Craps, Better Luck Next Time, You lose");
		    }
			else if (sum == 4 || sum == 5 ||sum == 6 || sum == 8 ||sum == 9 || sum == 10)
			{
				System.out.println("Point is (established) set to " + sum );
				
				do
				{
					rolling();
					total = add();
					System.out.println("You rolled " + dice1 + "+" +dice2+ "=" + total);
					if(total == sum)
					{
						System.out.println("Congratulations, You Win");
						break;
					}
					else if(total == 7)
					{
						System.out.println("Craps, Better Luck Next Time, You Lose");
						break;
					}
					
				}while(sum != 7);	
			}
			
		}while(true);

	}

}
