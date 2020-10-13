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

public class SalariedEmployee extends Employee
   {
      private double weeklySalary;

      // four-argument constructor
     public SalariedEmployee( String first, String last, String ssn,
         double salary )
      {
         super( first, last, ssn ); // pass to Employee constructor
         setWeeklySalary( salary ); 
      } 

      // set salary
      public void setWeeklySalary( double salary )
      {
         if ( salary >= 0.0 )
        	 weeklySalary = salary;
         else
            throw new IllegalArgumentException(
               "Weekly salary must be >= 0.0" );
      } 

      // return salary
      public double getWeeklySalary()
      {
         return weeklySalary;
      } 

        //Implement getPayment Method                             
      @Override
      public double getPaymentAmount()                                  
      {                                                                 
       return getWeeklySalary();                                      
     }                                   

      // return String representation of SalariedEmployee object
      @Override
      public String toString()
      {
         return String.format( "Salaried Employee: %s\n%s: $%,.2f\n",
            super.toString(), "Weekly Salary", getWeeklySalary() );
      } 
   } 