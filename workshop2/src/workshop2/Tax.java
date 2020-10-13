
/**********************************************
Workshop 2
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 03 October 2020
**********************************************/

package workshop2;

import java.util.*;
public class Tax 
{
	//function for computing the option 1
		public static void computeOne(Scanner input)
		{
		
			incomeTax iTax =new incomeTax();
			System.out.println("Choose Your Status");
			
			System.out.println("0 - single filer\n" + "1- married jointly or qualifying widow(er)\n" +
					"2- married separately\n" +
					"3 - head of household" );
			
			System.out.print("Enter the filing status: ");
			int choice = input.nextInt();
			System.out.print("Enter the Taxable Income: $");
			int amount = input.nextInt();
			System.out.print("\n");
			
			if(choice == 0)
			{
				iTax.setFilingStatus(incomeTax.SINGLE_FILER);
				iTax.setTaxableIncome(amount);
				System.out.printf("Tax is: $%.2f\n\n", iTax.getIncomeTax());
			}
			
			else if(choice == 1)
			{
				iTax.setFilingStatus(incomeTax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
				iTax.setTaxableIncome(amount);
				System.out.printf("Tax is: $%.2f\n\n", iTax.getIncomeTax());
			}
			else if(choice == 2)
			{
				iTax.setFilingStatus(incomeTax.MARRIED_SEPARATELY);
				iTax.setTaxableIncome(amount);
				System.out.printf("Tax is: $%.2f\n\n", iTax.getIncomeTax());
			}
			else if(choice == 3)
			{
				iTax.setFilingStatus(incomeTax.HEAD_OF_HOUSEHOLD);
				iTax.setTaxableIncome(amount);
				System.out.printf("Tax is: $%.2f\n\n", iTax.getIncomeTax());
			}
			else
			{
				System.out.printf("Invalid Selection, Please try again");
				System.out.print("\n\n");
			}
		}
		
		//function for computing the option 2
        public static void computeTwo(Scanner input)
		{
				
			// incomeTax 2001 object
			incomeTax tax2001 = new incomeTax();
			// Tax rates for 2001
			double[] taxRates2001 = {15, 27.5, 30.5, 35.5, 39.1};
			tax2001.setRates(taxRates2001);
			// 2001 Canada federal personal tax brackets
			int[][] brackets2001 = {
			{27050, 65550, 136750, 297350}, // Single filer
			{45200, 109250, 166500, 297350}, // Married jointly
			{22600, 54625, 83250, 148675}, // Married separately
			{36250, 93650, 151650, 297350}}; // Head of household
			tax2001.setIntervals(brackets2001);
					
			// Tax 2009 object
			incomeTax tax2009 = new incomeTax();
		
			double INCOME_FROM = 0,INCOME_TO = 0;
				
			final double INCOME_INTERVAL = 1000;
			System.out.println("Enter the amount From:");
			INCOME_FROM = input.nextInt();
			System.out.println("Enter the amount To: ");
			INCOME_TO = input.nextInt();
			System.out.println("Taxable income from " + INCOME_FROM + " to " + INCOME_TO);
			System.out.print("\n");
			System.out.println("**************************** Tax Year 2001 ************************************************");
			computeTax(tax2001, INCOME_FROM,INCOME_TO,
			INCOME_INTERVAL);
			System.out.println("**************************** Tax Year 2001 ************************************************");
			System.out.println(" " );
			System.out.println("**************************** Tax Year 2009 ************************************************");
			computeTax(tax2009, INCOME_FROM,INCOME_TO,
					INCOME_INTERVAL);
			System.out.println("**************************** Tax Year 2009 ************************************************");
			System.out.print("\n");
	}
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int option;
		do 
		{
		
			System.out.println("****** Canadian federal personal income tax ****** \n");
			System.out.println("1. Compute personal income Tax");
			System.out.println("2. Print the tax tables for taxable incomes (with range)");
			System.out.println("3. Exit\n");
			System.out.print("Enter your Choice: ");
			option = input.nextInt();
			switch(option) 
			{
				case 1:
					computeOne(input);
					break;
					
				case 2:
					computeTwo(input);
					break;
			
				case 3: 
					System.out.println("Exiting!!! Thank You");
					break;

				default:
				    System.out.printf("Invalid Selection, Please try again");	
				    System.out.print("\n\n");
			}
		
		}while(option !=3);
		
		input.close();
	
	}

	//function for displaying the table
	public static void computeTax(incomeTax tax, double incomeFrom,
			double incomeTo, double incomeInterval)
	{
	
		System.out.println("Income\t\t" + "Single\t" +
				"Married jointly\t " +
				"Married separately\t" +
				"Head of a House" );
		for (double taxIncome = incomeFrom; 
			  taxIncome <= incomeTo; taxIncome += incomeInterval) 
		{
			tax.setTaxableIncome(taxIncome);
			System.out.printf("%-14.0f", taxIncome);
			tax.setFilingStatus(incomeTax.SINGLE_FILER);
			System.out.printf("%7.2f", tax.getIncomeTax());
			tax.setFilingStatus(incomeTax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%17.2f", tax.getIncomeTax());
			tax.setFilingStatus(incomeTax.MARRIED_SEPARATELY);
			System.out.printf("%20.2f", tax.getIncomeTax());
			tax.setFilingStatus(incomeTax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%17.2f\n", tax.getIncomeTax());
		}
	}
}
