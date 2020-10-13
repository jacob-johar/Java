
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

public class PayrollEmployeeSystem {

	public static void main(String[] args) {
		
		
         Payable[] payableObjects = new Payable[ 4 ];
		
		 payableObjects[0] = new CommissionEmployee("Jacob", "Johar", "437-213-888", 375.00, .5);
		 
		 payableObjects[1] = new HourlyEmployee("Eldho", "Paul", "123-456-789", 100, 50);
		 
		 payableObjects[2] = new SalariedEmployee("Aslam", "Karim", "324-678-964", 3000.00);
		 
		 payableObjects[3] = new BasePlusCommissionEmployee("Deepak", "Hari", "778-543-555", 750.00, .5, 100.00);
		 
		 
		 System.out.println("*********** Employee and Payable Case Study *************\n");
		 
		 for ( Payable currentPayable : payableObjects )
		 {
			 // output currentPayable and its appropriate payment amount
			 System.out.printf( "%s \n%s: $%,.2f\n\n",
					 currentPayable.toString(),
					 "Payment Due", currentPayable.getPaymentAmount() );
		 } 
		 
		 
		 System.out.println("*********** Employee and Payable Case Study *************\n");

	}

}
