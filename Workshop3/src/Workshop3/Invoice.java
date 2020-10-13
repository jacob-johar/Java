
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

public class Invoice implements Payable {

	     private String part;
	     private String Description;
	     private int count;
	     private double price;
	
	      // four-argument constructor
	     public Invoice( String partNo, String description, int count,
	        double price )
	      {
             part = partNo;
	         Description = description;
	        setQuantity( count ); 
	        setPricePerItem( price ); 
	      } 
	
	      // set part number
	     public void setPartNumber( String partNo )
	      {
	         part = partNo; 
	      } 

	     // get part number
	     public String getPartNumber()
	      {
	       return part;
	      } 
	
	      // set description
         public void setPartDescription( String description )
	      {
	         Description = description; 
	     } 
	
	      // get description
	      public String getPartDescription()
	     {
	        return Description;
	      } 
	
	      // set quantity
	      public void setQuantity( int quantity )
	      {
	         if ( quantity >= 0 )
	            count = quantity;
	         else
	            throw new IllegalArgumentException( "Count must be >= 0" );
	      } 
	
	      // get quantity
	      public int getQuantity()
	      {
	         return count;
	      } 
	
	      // set price per item
	      public void setPricePerItem( double amount )
	      {
	         if ( amount >= 0.0 )
	            price = amount;
	         else
	            throw new IllegalArgumentException(
	               "Price per item must be >= 0" );
	      } 
	      
	      // get price per item
	      public double getPricePerItem()
	     {
	         return price;
	      } 
	
	      // return String representation of Invoice object
	      @Override
	      public String toString()
	      {
	         return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
	            "invoice", "Part", getPartNumber(), getPartDescription(),
	            "Count", getQuantity(), "Price ", getPricePerItem() );
	     } 
	
	     // method required to carry out contract with interface Payable     
	      public double getPaymentAmount()                                    
	     {                                                                   
	       return getQuantity() * getPricePerItem(); // calculate total cost
	     } 
}
