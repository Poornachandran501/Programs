package Coreproject;


import java.util.Scanner;
public class CharacterASCII {

	public static void main(String[] args) {
		 
		       Scanner sc = new Scanner(System.in);

		        System.out.print("Enter an ASCII value (65-122): ");
		        int ascii = sc.nextInt();

		        
		        char ch = (char) ascii;

		        System.out.println("Character for ASCII value " + ascii + " is: " + ch);
		    }
		

	}

