

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

public class incomeTax 
{	
	int filingStatus;
	
	public static final int SINGLE_FILER = 0;

	public static final int
	MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;

	public static final int MARRIED_SEPARATELY = 2;

	public static final int HEAD_OF_HOUSEHOLD = 3;

	public int[][] intervals;

	double[] rates;

	double taxableIncome;

	//No Argument Constructor
	incomeTax()
	{

	double[] taxRates2009 = {10, 15, 25,
	28, 33, 35};
	
	// 2009 Canada federal personal tax brackets
	int[][] brackets2009 = {
	// Single filer
	{8350, 33950, 82250, 171550, 372950},
	// Married jointly
	{16700, 67900, 137050, 20885, 372950},
	// Married separately
	{8350, 33950, 68525, 104425, 186475},
	//Head of household
	{11950, 45500, 117450, 190200, 372950}};

	setRates(taxRates2009);
	
	setIntervals(brackets2009);
	}
	
	// Parameterized  Constructor
	
	incomeTax(int filingStatus, int[][] intervals, double[]
	rates, double taxableIncome) 
	{
		setFilingStatus(filingStatus);
		setIntervals(intervals);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}
	
	// Getters and Setters
	
	public int getFilingStatus() 
	{
		return filingStatus;
	}
	public void setFilingStatus(int filingStatus) 
	{
		this.filingStatus = filingStatus;
	}
	public int[][] getIntervals()
	{
		return intervals;
	}
	public void setIntervals(int[][] intervals) 
	{
		this.intervals = intervals;	
	}
	public double[] getRates() 
	{
		return rates;
	}
	
	public void setRates(double[] rates) 
	{
		this.rates = rates;
	}
	
	public double getTaxableIncome() 
	{
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome)
	{
		this.taxableIncome = taxableIncome;
	}
	
	
 // Function to compute the tax 
	public double getIncomeTax() 
	{
		double PayableTax = 0, incomeTaxed = 0,income = taxableIncome;
		if (rates.length >= 2) 
		{
			for (int i = rates.length - 2; i >= 0; i--) 
			{
				if (income > intervals[filingStatus][i]) 
				{
					PayableTax += (incomeTaxed = income - intervals[filingStatus][i]) * rates[i + 1];
					income -= incomeTaxed;
				}
			}
		}
		PayableTax += intervals[filingStatus][0] * rates[0];
		return PayableTax/100;
	}
}
