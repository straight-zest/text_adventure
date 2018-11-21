package somin;

import java.util.Scanner;

public class Addition_loop {

	public static void main(String[] args) {
	
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10); 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("what is " + number1 + " plus " + number2 + "?");
		int answer = input.nextInt();
		
		while ( number1 + number2 != answer) {
			System.out.println("sorry, that is not correct. please try again.");
			answer = input.nextInt();
		}
		System.out.println("Correct!");
	}

}
