
/**********************************************
Workshop 4 task2
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 20 October 2020
**********************************************/


package w4task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args)  
	{
		Scanner scanner = new Scanner(System.in); 
		 System.out.println("******** Letter Count ********");
		      
		System.out.print("File Name:");
		String fName = scanner.next();
		System.out.print("\n");
	
		File inputFile = new File(fName);

		try (Scanner scannerFile = new Scanner(inputFile)) {
			int[] lCount = new int[26];
			int[] sCount = new int[26];

			while (scannerFile.hasNext())
			{
			String line = (scannerFile.nextLine());

			for (int i = 0; i < line.length(); i++)
			 {
			
			   char ch=line.charAt(i);
			   if(Character.isLowerCase(ch)){
				   int asciiValue = ((int) ch - 97);
				   sCount[asciiValue]++;
				}
				else if(Character.isUpperCase(ch)){
					 int asciiValue = ((int) ch - 65);
					   lCount[asciiValue]++;
				}
			  
			  } 
			} 
			 System.out.println("******** Uppercase Letter Count ********");
			 System.out.print("\n");
			for (int i = 0; i < lCount.length; i++)
			{
			  System.out.println("Number of " + (char)('A' + i) + "'s present in the file: " + lCount[i]);
			}
			 System.out.print("\n");
			 System.out.println("******** Lowercase Letter Count ********");
			 System.out.print("\n");
			for (int i = 0; i < sCount.length; i++)
			{
			  System.out.println("Number of " + (char)('a' + i) + "'s present in the file: " + sCount[i]);
			}
		} 
		catch(FileNotFoundException e)
        {
            System.out.print("Error opening the file " + fName);
            System.exit(0);
        }
		scanner.close();
	} 
} 