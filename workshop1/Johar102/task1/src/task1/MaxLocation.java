package task1;

/**********************************************
Workshop #
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:26 September 2020
**********************************************/

import java.util.Scanner;

public class MaxLocation 
{
	static double maxVal = 0;
	static int row = 0 ;
	static int column = 0 ;
	
	// function to return max value location Index
	public static int[] maxLoc(double[][]value)
	{
		int[] locIndex = new int[2];
		int m,n,i,j;
		maxVal = value[0][0];
		m = value.length;
		n = value[0].length;
		for(i = 0; i < m; i++)
		{
			 for(j = 0;j < n; j++)
			 {
				 if(value[i][j] > maxVal)
				 {
					 maxVal = value[i][j];
					 locIndex[0] = i;
					 locIndex[1]= j;
				 }
			 }
		}
		
		return locIndex;
	}
	
	
// main function
	
	public static void main(String[] args) 
	
	{
		int i,j;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array");
		row = input.nextInt();
		column = input.nextInt();
		double[][] arr = new double[row][column];
		
		System.out.println("Enter the elements of the array");
		
		for(i = 0; i < row; i++)
		{
			 for(j = 0;j < column; j++)
			 {
				arr[i][j] = input.nextDouble();
				
			 }
		}
		int[] loc = maxLoc(arr);
		
		System.out.println("The location of the largest element is " + maxVal + " at(" +loc[0]+ "," +loc[1]+")");

	}

}

