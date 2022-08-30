package com.assignments;
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
	
		boolean isVowel = false;
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);
		
		switch (ch) {
		
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :	isVowel =true;
			
		}
		
		if (isVowel == true) {
			System.out.println(ch+"is a Vowel");
		}
		
		 else {
			if ( (ch >='a' && ch<='z') || (ch>='A' && ch<='Z' ) );
			System.out.println(ch+"is a Consonant...");
			}
	
		    System.out.println("Error in Input...");

	} 
}