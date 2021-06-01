package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The Class ScrabbleCalculator.
 */
public class ScrabbleCalculator {
	

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("               Welcome to the Scrabble Calculator!");
		System.out.println("\nHere, you can enter a word and determine how many points a word would");
		System.out.println("                score you in a game of Scrabble!");
		
		System.out.print("\nHow many letters are in your word? ");
		
		Scanner console = new Scanner(System.in);
		
		int numberOfLetters = console.nextInt();
		
		System.out.print("\nWhat is the word? ");
		
		String word = console.next();
		
		int totalSum = 0;
		
		for (int i = 0; i < numberOfLetters; i++) {
			char character = word.charAt(i);
			String s = "" + character;
			int eachLetterValue = findValue(s);
			totalSum += eachLetterValue;
		}
		
		console.close();
		
		System.out.println("\nIt looks like the word " + word + " would give a score of " + totalSum + ".");
	}
	
	/**
	 * Determine the value of the given letter.
	 *
	 * @param character the character we need to know the value of
	 * @return the resulting value of the character
	 */
	public static int calculateLetter(char character) {
		if ( character == 'A' || character == 'E' || character == 'I' || character == 'L' || character == 'N'
				|| character == 'O' || character == 'S' || character == 'T' || character == 'U' ) {
			// Each of these characters has a value of 1.
			return 1;
		}
		
		if ( character == 'D' || character == 'G' ) {
			// Value of 2.
			return 2;
		}
		
		if ( character == 'B' || character == 'C' || character == 'M' || character == 'P' ) {
			// Value of 3.
			return 3;
		}
		
		if ( character == 'F' || character == 'H' || character == 'V' || character == 'W' || character == 'Y' ) {
			// Value of 4.
			return 4;
		}
		
		if ( character == 'K' ) {
			// Value of 5.
			return 5;
		}

		if ( character == 'J' || character == 'X' ) {
			// Value of 8.
			return 8;
		}
		
		if ( character == 'Q' || character == 'Z' ) {
			// Value of 10.
			return 10;
		}
		
		// Hm, guess the character isn't in the alphabet.
		return 0;
	}
	
	public static int getValue(char character) {
		int value = 0;
		if ( character == 'A' ) {
			value = 1;
		} if ( character == 'B' ) {
			value = 3;
		} if ( character == 'C' ) {
			value = 3;
		} if ( character == 'D' ) {
			value = 2;
		} if ( character == 'E' ) {
			value = 1;
		} if ( character == 'F' ) {
			value = 4;
		} if ( character == 'G' ) {
			value = 2;
		} if ( character == 'H' ) {
			value = 4;
		} if ( character == 'I' ) {
			value = 1;
		} if ( character == 'J' ) {
			value = 8;
		} if ( character == 'K' ) {
			value = 5;
		} if ( character == 'L' ) {
			value = 1;
		} if ( character == 'M' ) {
			value = 3;
		} if ( character == 'N' ) {
			value = 1;
		} if ( character == 'O' ) {
			value = 1;
		} if ( character == 'P' ) {
			value = 3;
		} if ( character == 'Q' ) {
			value = 10;
		} if ( character == 'R' ) {
			value = 1;
		} if ( character == 'S' ) {
			value = 1;
		} if ( character == 'T' ) {
			value = 1;
		} if ( character == 'U' ) {
			value = 1;
		} if ( character == 'V' ) {
			value = 4;
		} if ( character == 'W' ) {
			value = 4;
		} if ( character == 'X' ) {
			value = 8;
		} if ( character == 'Y' ) {
			value = 4;
		} else {
			value = 10;
		}
		return value;
	}
	
	public static int findValue(String character) {
		ArrayList<String> value1 = new ArrayList<>(Arrays.asList("A", "E", "I", "L", "N", "O", "R", "S", "T", "U"));
		ArrayList<String> value2 = new ArrayList<>(Arrays.asList("D", "G"));
		ArrayList<String> value3 = new ArrayList<>(Arrays.asList("B", "C", "M", "P"));
		ArrayList<String> value4 = new ArrayList<>(Arrays.asList("F", "H", "V", "W", "Y"));
		ArrayList<String> value5 = new ArrayList<>(Arrays.asList("K"));
		ArrayList<String> value8 = new ArrayList<>(Arrays.asList("J", "X"));
		ArrayList<String> value10 = new ArrayList<>(Arrays.asList("Q", "Z"));
		
		if (value1.contains(character)) {
			return 1;
		} if (value2.contains(character)) {
			return 2;
		} if (value3.contains(character)) {
			return 3;
		} if (value4.contains(character)) {
			return 4;
		} if (value5.contains(character)) {
			return 5;
		} if (value8.contains(character)) {
			return 8;
		} if (value10.contains(character)) {
			return 10;
		}
		return 0;
		
	}
}
