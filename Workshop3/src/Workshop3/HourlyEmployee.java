/**********************************************
Workshop 3
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 10 October 2020
**********************************************/


package Workshop3;

public  class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;

	
	 // five-argument constructor
	public HourlyEmployee(String first, String last, String ssn, double Wage, double Hours) {
		super(first, last, ssn);
		setWage(Wage);
		setHours(Hours);
	}

	//setter Wage
	public void setWage(double Wage)
	{
		if(Wage > 0)
		{
			wage = Wage; 
		}
		else
		{
			throw new IllegalArgumentException( " – wage >= 0" );
		}
	}
	//getter Wage
		public double getWage()
		{
			return wage;
		}
		
		//setter Hours
	public void setHours(double Hours)
	{
		if(Hours > 0 && Hours < 168)
		{
			hours = Hours; 
		}
		else
		{
			throw new IllegalArgumentException( " – hours >= 0" );
		}
	}
	
	//getter Hours
	public double getHours() 
	{
		
		return hours;
	}
	
	@Override
	public double getPaymentAmount() {
		
		double result = 0.0;
		if(getHours() > 40 )
        {
                double value = getHours() - 40;
                double wage = getWage() + (getWage() * 1.5);
                
                result = wage * value + getWage()* 40 ;
               
        }else
        {
        	result = getWage() * getHours();
                 
        }
		return result;
	}
	
	public String toString()
	  {
		  
		  return String.format( "HourlyEmployee: %s\n%s: $%,.2f\n%s: %,.2f\n", super.toString(), "Wage", getWage(), "Hour",getHours() );
	  }
}
