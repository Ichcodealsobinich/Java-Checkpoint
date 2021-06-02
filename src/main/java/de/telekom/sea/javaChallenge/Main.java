package de.telekom.sea.javaChallenge;

import de.telekom.sea.javaChallenge.part1.Part1;
import de.telekom.sea.javaChallenge.part2.Part2;
import de.telekom.sea.javaChallenge.part3.Part3;
import de.telekom.sea.javaChallenge.part4.Part4;
import de.telekom.sea.javaChallenge.part5.*;

public class Main {

	public static void main(String[] args) {

		/*Part1 part1 = new Part1();
		part1.run();
		
		Part2 part2 = new Part2();
		part2.sortBySize();
		
		Part3 part3 = new Part3();
		part3.runFor();
		part3.runWhile();
		part3.runDoWhile(); 
		
		Part4 part4 = new Part4();
		part4.count();*/
		
		Part5 part5 = new Part5();
		PersonImpl p1 = new PersonImpl();
		p1.setVorname("Paul");
		PersonImpl p2 = new PersonImpl();
		p2.setVorname("Peter");
		PersonImpl p3 = new PersonImpl();
		p3.setVorname("Hans");
		
		
		System.out.println("Ist die Liste leer? - " +part5.empty());
		part5.add(p1);
		System.out.println("Ist die Liste leer? - " +part5.empty());
		part5.add(p2);
		System.out.println("Ist die Liste leer? - " +part5.empty());
		part5.add(p3);
		System.out.println(part5.remove().getVorname() + " wurde entfernt");
		System.out.println(part5.head().getVorname() + " steht vorne");
		
	}

}
