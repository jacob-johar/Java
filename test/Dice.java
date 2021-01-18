import java.util.Random;  

public class Dice
{

    static int dice1,dice2,dice3,dice4,dice5, total,sum;
    
   
	public static void  rolling()
	{
	
	
	  dice1 = (int) ((Math.random() * 6) + 1);
	  

	  dice2 = (int) ((Math.random() * 6) + 1);
	  
	  dice3 = (int) ((Math.random() * 6) + 1);
	  dice4 = (int) ((Math.random() * 6) + 1);
	  dice5 = (int) ((Math.random() * 6) + 1);
	  
	}
	
	

	// main function
	public static void main(String[] args) 
	{
		Random rand = new Random(System.currentTimeMillis());
		
		do
		{
			rolling();
			
			
			
			if (dice1 == 3 || dice2 == 3 || dice3 == 3 || dice4 == 3|| dice5 == 3 )
			{
				total = 0
						
			   if(dice1 == 3)
			   {
					  dice2 = (int) ((Math.random() * 6) + 1);
					  dice3 = (int) ((Math.random() * 6) + 1);
					  dice4 = (int) ((Math.random() * 6) + 1);
					  dice5 = (int) ((Math.random() * 6) + 1); 
			   }
			   
				if(dice2 == 3)
				   {
					      dice1 = (int) ((Math.random() * 6) + 1);
						  dice3 = (int) ((Math.random() * 6) + 1);
						  dice4 = (int) ((Math.random() * 6) + 1);
						
						  dice5 = (int) ((Math.random() * 6) + 1); 
				   }
				if(dice3 == 3)
				   {
					    
					  dice1 = (int) ((Math.random() * 6) + 1);
					  dice2 = (int) ((Math.random() * 6) + 1);
					  dice4 = (int) ((Math.random() * 6) + 1);
					
					  dice5 = (int) ((Math.random() * 6) + 1); 
				   }
				if(dice4 == 3)
				   {	
					  dice1 = (int) ((Math.random() * 6) + 1);
					  dice2 = (int) ((Math.random() * 6) + 1);
					  dice3 = (int) ((Math.random() * 6) + 1);
					
					  dice5 = (int) ((Math.random() * 6) + 1); 
				   }
				if(dice5 == 3)
				   {
					      dice1 = (int) ((Math.random() * 6) + 1);
						  dice2 = (int) ((Math.random() * 6) + 1);
						  dice3 = (int) ((Math.random() * 6) + 1);
						
						  dice4 = (int) ((Math.random() * 6) + 1); 
				   }
				
				
						
			}
			else 
		    {
				do
				{
					int smallest = (dice1 < dice2 && dice3 && dice4 && dice5) ? dice1 : (dice2 < dice1 && dice3 && dice4 && dice5) ? dice2
							 : (dice3 < dice1 && dice2 && dice4 && dice5) ? dice3 : (dice4 < dice1 && dice2 && dice3 && dice5) ? dice4 :dice5);
							 total += smallest
										
									   if(dice1 == smallest)
									   {
											  dice2 = (int) ((Math.random() * 6) + 1);
											  dice3 = (int) ((Math.random() * 6) + 1);
											  dice4 = (int) ((Math.random() * 6) + 1);
											  dice5 = (int) ((Math.random() * 6) + 1); 
									   }
									   
										if(dice2 == smallest)
										   {
											      dice1 = (int) ((Math.random() * 6) + 1);
												  dice3 = (int) ((Math.random() * 6) + 1);
												  dice4 = (int) ((Math.random() * 6) + 1);
												
												  dice5 = (int) ((Math.random() * 6) + 1); 
										   }
										if(dice3 == smallest)
										   {
											    
											  dice1 = (int) ((Math.random() * 6) + 1);
											  dice2 = (int) ((Math.random() * 6) + 1);
											  dice4 = (int) ((Math.random() * 6) + 1);
											
											  dice5 = (int) ((Math.random() * 6) + 1); 
										   }
										if(dice4 == smallest)
										   {	
											  dice1 = (int) ((Math.random() * 6) + 1);
											  dice2 = (int) ((Math.random() * 6) + 1);
											  dice3 = (int) ((Math.random() * 6) + 1);
											
											  dice5 = (int) ((Math.random() * 6) + 1); 
										   }
										if(dice5 == smallest)
										   {
											      dice1 = (int) ((Math.random() * 6) + 1);
												  dice2 = (int) ((Math.random() * 6) + 1);
												  dice3 = (int) ((Math.random() * 6) + 1);
												
												  dice4 = (int) ((Math.random() * 6) + 1); 
										   }	
										
					
				}while(true);
				 
			
			     
		    }
			
					
			
		}while(true);

	}

}
