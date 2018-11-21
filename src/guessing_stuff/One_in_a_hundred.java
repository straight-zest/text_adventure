package guessing_stuff;

import java.util.Scanner;

public class One_in_a_hundred {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	//varibles
	int guess;
	int answer;
	
	answer = 42;
	
	System.out.println("Please Enter a number between 1 and 100");
	guess = input.nextInt();
//	guess = input.nextInt();
	
	while (guess != answer) {
	System.out.println("Sorry, that is not the correct guess.");
	
	if (guess > answer){
		System.out.println("Guess lower.");
		
			}
	else {
		System.out.println("Guess higher.");
			}
	if ( guess==answer) {
	break;
	}
	guess = input.nextInt();
	}
	
	System.out.println("Correct!");
	}
}