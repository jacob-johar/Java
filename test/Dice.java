package test;

import java.util.Random;
import java.util.Scanner;  

public class Dice
{
    // function for rolling the specified number of dice
	public static int[]  rolling(int n){
	  int[] myNum = new int[50];
	 
	  for(int i = 0; i< n; i++) {
		  myNum[i] = (int) ((Math.random() * 6) + 1);
	  }
		
	  return myNum;
	}

	//function to check if number 3 is present or not
	public static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
	
	// function which returns the index values that don't have the value 3
	public static int[] find(int[] array, int value) {
		int[] indexes = new int[50];
		int j = 0;
	    for(int i=0; i<array.length; i++) 
	         if(array[i] != value) {
	        	 indexes[j] = i;
	        	 j++;
	         }
	             return indexes;
	}
	
	// function to compute the smallest value
	public static int getSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
		}  
	

	// main function
	public static void main(String[] args) 
	{
		Random rand = new Random(System.currentTimeMillis());
		int count,total = 0,iteration,j = 1;	
	    boolean flag = false;
		Scanner input=new Scanner(System.in);
       
		System.out.print("Enter the number of dice");
		count = input.nextInt();
		
		System.out.print("Enter the number of iterations");
		iteration = input.nextInt();
		
		int[] dice = rolling(count);
	    flag = contains(dice,3);
		do {
		
		  if(flag) {
			total = 0;
		    dice = find(dice,3);	
		    flag = false;
		}
		dice = rolling(dice.length);
		int smallest = getSmallest(dice,dice.length);
		dice = find(dice,smallest);	
		total += smallest ;
		j++;
		}while(j < iteration);
		
		System.out.print("Total Value is "+ total);
		
	}
}
		
			
		