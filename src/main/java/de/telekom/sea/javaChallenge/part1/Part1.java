package de.telekom.sea.javaChallenge.part1;

public class Part1 {
	
	public void run() {
		
		System.out.println();
		System.out.println("############ Part 1 #############");
		System.out.println();
		
		/* does not work because a final variable cannot be changed later. 
		 * i++ would change the final variable i.*/
		for (/*final*/ int i = 0; i< 8; i++) {
			System.out.println( "Geht nicht" );
		}
	}
}
