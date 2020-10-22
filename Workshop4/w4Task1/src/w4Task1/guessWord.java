
/**********************************************
Workshop 4 Task1
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 20 October 2020
**********************************************/

package w4Task1;

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class guessWord {

	public static void main(String[] args) throws IOException {
	Scanner input = new Scanner(System.in);
	int guessMissed = 0;
	FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;
    PrintWriter printWriter = null;
	String startPlay; 
	do {
	
	char[] word = retriveWord();
	char[] asterisks = new char[word.length];
	for (int i = 0; i < asterisks.length; i++) {
		asterisks[i] = '*';
	}
  
	do {
	
	char guess = retrieveGuess(asterisks);

	if (!checkGuess(word, asterisks, guess))
		guessMissed++;

	} while (!checkWordCompleted(asterisks));

	System.out.print("The word is ");
	System.out.print(word);
	System.out.println(" You missed " + guessMissed +
	(guessMissed > 1 ? " times" : " time"));

	System.out.print("Enter a new word to be added in the memory > ");
    String wordAdded = input.next();
    
    try {
            String fileName = "hangman.txt";
            fileWriter = new FileWriter(fileName,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(wordAdded);
   
    } finally {
            try {
            	printWriter.close();
            	bufferedWriter.close();
            	fileWriter.close();
	} catch (IOException io){
		System.out.println(" Error Occurred while writing to file");

	}

	}

	System.out.println("Do you want to guess another word? Enter y or n>");
	startPlay = input.next();

	} while (startPlay.charAt(0) == 'y');
	}


	public static char[] retriveWord() throws FileNotFoundException {

	File file = new File("hangman.txt");
	if (!file.exists()) {
		System.out.print("File " + file.getName() + " does not exist");
		System.exit(1);
	}

	ArrayList<String> wordAdded = new ArrayList<>();
	try (

	Scanner input = new Scanner(file);
	) {
	while (input.hasNext()) {
		wordAdded.add(input.next());
	}
	}
	String pickedWord = wordAdded.get((int)(Math.random() * wordAdded.size()));
	char[] words = pickedWord.toCharArray();
	return words;
	}


	public static boolean checkGuess(char[] word, char[] blanks, char guessDone) {
	boolean valid = false;
	int m = 5;
	for (int i = 0; i < word.length; i++) {
	if (word[i] == guessDone) {
		valid = true;
	if (blanks[i] != guessDone) {
		blanks[i] = guessDone; 
		m = 0;
	}
	else 
		m = 1;
	}
	}
	if (m > 0)
	{ 
		System.out.print("\t" + guessDone);
		String msg =  m == 1 ? " is already in the word": " is not in the word";
		System.out.println(msg);
		
	}
	return valid;
	}

	public static boolean checkWordCompleted(char[] word) {
	boolean result = false;
	for (char check : word)
	{
		result = check == '*' ? false : true;

	}
	return result;
	
	}

	public static char retrieveGuess(char[] asterisks){
	Scanner input = new Scanner(System.in);
	System.out.print("(Guess) Enter a letter in word ");
	System.out.print(asterisks);
	System.out.print(" > ");
	String in = input.next();
	return in.charAt(0);
	}
	
}
