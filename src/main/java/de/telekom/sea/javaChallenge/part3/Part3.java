package de.telekom.sea.javaChallenge.part3;

public class Part3 {
	public void runFor() {
		for (int i = 0; i < 8; i++ ) {
		    System.out.print(i);		    
		}
		System.out.println();
	}
	
	public void runWhile() {
		int i = 0;
		while (i<8) {
			System.out.print(i);
			i++;
		}
		System.out.println();
	}
	
	public void runDoWhile() {
		int i = 0;
		do {
			System.out.print(i);
			i++;
		} while (i<8);
		System.out.println();
	}
}
