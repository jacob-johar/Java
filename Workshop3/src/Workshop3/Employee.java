
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

public abstract class Employee implements Payable
  {
      private String first;
      private String last;
      private String ssn;

      // three-argument constructor
      public Employee( String firstName, String lastName, String ssnNo )
      {
         first = firstName;
         last = lastName;
         ssn = ssnNo;
      } 

      // set first name
      public void setFirstName( String firstName )
      {
         first = firstName; 
      } 

      // return first name
      public String getFirstName()
      {
         return first;
      } 

      // set last name
      public void setLastName( String lastName )
      {
         last = lastName; 
      } 

      // return last name
      public String getLastName()
      {
         return last;
      } 

      // set social security number
      public void setSocialSecurityNumber( String ssnNo )
      {
         ssn = ssnNo; 
      } 

      // return social security number
      public String getSocialSecurityNumber()
      {
         return ssn;
      } 

     // return String representation of Employee object
      @Override
      public String toString()
      {
         return String.format( "%s %s\nSocial Security Number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber() );
      } 

     
   } 