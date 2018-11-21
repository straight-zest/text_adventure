package text_adventure;

import java.util.Scanner;

public class Text_adventure {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("          _______  _______ _________ _       _________ _______ \r\n" + 
			"|\\     /|(  ___  )(  ____ \\\\__   __/( \\      \\__   __/(  ____ \\\r\n" + 
			"| )   ( || (   ) || (    \\/   ) (   | (         ) (   | (    \\/\r\n" + 
			"| |   | || (___) || (_____    | |   | |         | |   | (_____ \r\n" + 
			"( (   ) )|  ___  |(_____  )   | |   | |         | |   (_____  )\r\n" + 
			" \\ \\_/ / | (   ) |      ) |   | |   | |         | |         ) |\r\n" + 
			"  \\   /  | )   ( |/\\____) |___) (___| (____/\\___) (___/\\____) |\r\n" + 
			"   \\_/   |/     \\|\\_______)\\_______/(_______/\\_______/\\_______)\r\n" + 
			"                                                               ");
	
	int race;
	int archetpye;
	
	int STR = 0;
	int DEX = 0;
	int CON = 0;
	int INT = 0;
	int CHA = 0;
	int WIS = 0;
	
	int Act1;
	int Act2;
	int Act3;
	int Act4;
	
	System.out.println("In the port city of Sentum lived a(n)...");
	System.out.println("Please choose your race:");
	System.out.println("Human(1)");
	System.out.println("Elf(2)");
	System.out.println("Dwarf(3)");
	System.out.println("Halfling(4)");
	race = input.nextInt();
	System.out.println("Who was a...");
	System.out.println("Please choose your class:");
	System.out.println("Fighter(1)");
	System.out.println("Wizard(2)");
	System.out.println("Cleric(3)");
	System.out.println("Theif(4)");
	archetpye = input.nextInt();
	
	if(race == 1){
		STR = STR+1;
		DEX = DEX+1;
		CON = CON+0;
		INT = INT+2;
		CHA = CHA+0;
		WIS = WIS-2;
	}
	
	if(race == 2) {
		STR = STR-1;
		DEX = DEX+2;
		CON = CON-1;
		INT = INT+1;
		CHA = CHA+0;
		WIS = WIS+1;
		}
	if(race == 3) {
		STR = STR+1;
		CON = CON+2;
		INT = INT+0;
		CHA = CHA-1;
		WIS = WIS+0;
		}
	if(race == 4) {
		STR = STR+0;
		DEX = DEX+1;
		CON = CON+0;
		INT = INT-1;
		CHA = CHA+2;
		WIS = WIS+0;
		}
	if(archetpye == 1){
		STR = STR+1;
		Act1;
		Act2;
		Act3;
		Act4;
	}
	
	if(archetpye == 2) {
		INT = INT+1;
		Act1;
		Act2;
		Act3;
		Act4;
		}
	if(archetpye == 3) {
		WIS = WIS+1;
		Act1;
		Act2;
		Act3;
		Act4;
		}
	if(archetpye == 4) {
		DEX = DEX+1;
		Act1;
		Act2;
		Act3;
		Act4;
		}
	}

}
