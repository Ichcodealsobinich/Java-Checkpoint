package de.telekom.sea.javaChallenge.part1;

public class Part1 {
	
	public void run() {
		
		/* does not work because a final variable cannot be changed later. 
		 * i++ would change the final variable i.*/
		for (/*final*/ int i = 0; i< 8; i++) {
			System.out.println( "Geht nicht" );
		}
	}
}
