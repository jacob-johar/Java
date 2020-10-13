
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

public  class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	//6 argument constructor
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		
		setBaseSalary(salary);
	}
	
	//setter baseSalary
	public void setBaseSalary( double salary) 
	  {
		  if ( salary > 0 )
			  baseSalary = salary;
		  else
			  throw new IllegalArgumentException( "Base Salary must be >= 0" );
	  }
	
	
	//getter baseSalary
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	 public String toString()
	  {
		  return String.format( "BasePlusCommissionEmployee: \n%s%s: $%,.2f\n", super.toString(), "Base salary", getBaseSalary() );
		  
	  }
	 
	 @Override
		public double getPaymentAmount() {
		 
		 double value = (10 * super.getPaymentAmount())/100;
		 double result = getBaseSalary() + value;
         return result;
		}
}
