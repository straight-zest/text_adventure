package guessing_stuff;

import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class THE_LOTTO_BB {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Variables
	int UserNum1;
	int UserNum2;
	int UserNum3;
	int UserNum4;
	int UserNum5;
	int UserNum6;
	int Num1;
	int Num2;
	int Num3;
	int Num4;
	int Num5;
	int Num6;
	
	Num1 = ThreadLocalRandom.current().nextInt(1,40);
	Num2 = ThreadLocalRandom.current().nextInt(1,40);
	Num3 = ThreadLocalRandom.current().nextInt(1,40);
	Num4 = ThreadLocalRandom.current().nextInt(1,40);
	Num5 = ThreadLocalRandom.current().nextInt(1,40);
	Num6 = ThreadLocalRandom.current().nextInt(1,40);
	 
	System.out.println("Please Choose Your First Number!");
	UserNum1= input.nextInt();
	System.out.println("Please Choose Your Second Number!");
	UserNum2= input.nextInt();
	System.out.println("Please Choose Your Third Number!");
	UserNum3= input.nextInt();
	System.out.println("Please Choose Your Fourth Number!");
	UserNum4= input.nextInt();
	System.out.println("Please Choose Your Fifth Number!");
	UserNum5= input.nextInt();
	System.out.println("Please Choose Your Sixth Number!");
	UserNum6= input.nextInt();
	}

}
