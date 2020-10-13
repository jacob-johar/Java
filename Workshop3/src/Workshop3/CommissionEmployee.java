
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

public   class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	
	 // five-argument constructor
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
		super(first, last, ssn);
		
		setGrossSales(sales);
		setCommissionRate(rate);
		
	}
	//setter grossSales
	 public void setGrossSales(double sales)
	  {
		if ( sales > 0 )
		  grossSales = sales;
	  else
		  throw new IllegalArgumentException( " – gross sales of employee >= 0" );
	  }
	 
	//getter grossSales
	 public double getGrossSales()
	 {
		return grossSales; 
	 }
	 
		//setter Commission Rate
	 public void setCommissionRate(double rate)
	  {
		 if ( rate > 0 && rate < 1 )
			  commissionRate = rate;
		  else
			  throw new IllegalArgumentException( " – rate > 0 and rate < 1" );
		  
	  }
	 
		//getter CommissionRate
	 public double getCommissionRate()
	  {
		  return commissionRate; 
	  }
	 
	 public String toString()
	  {
		 return String.format( "CommissionEmployee: %s\n%s: $%,.2f\n%s: %,.2f\n", super.toString(), "Gross of employee", this.getGrossSales(), "CommissionRate",this.getCommissionRate() );
	  }
	 @Override
		public double getPaymentAmount() {
			return (getGrossSales() * getCommissionRate())/100;
	 }
	  	 
}
