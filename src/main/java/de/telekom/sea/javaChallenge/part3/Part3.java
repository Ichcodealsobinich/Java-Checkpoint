package de.telekom.sea.javaChallenge.part3;

public class Part3 {
	public void runFor() {
		System.out.print("For loop:      ");
		for (int i = 0; i < 8; i++ ) {
		    System.out.print(i);		    
		}
		System.out.println();
	}
	
	public void runWhile() {
		System.out.print("While loop:    ");
		int i = 0;
		while (i<8) {
			System.out.print(i);
			i++;
		}
		System.out.println();
	}
	
	public void runDoWhile() {
		System.out.print("Do While loop: ");
		int i = 0;
		do {
			System.out.print(i);
			i++;
		} while (i<8);
		System.out.println();
	}
	
	public void run() {
		System.out.println();
		System.out.println("############ Part 3 #############");
		System.out.println();
		
		runFor();
		runWhile();
		runDoWhile();
	}
}
