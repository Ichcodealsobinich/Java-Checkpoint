package de.telekom.sea.javaChallenge.part5;

public class Part5 {

	public void run() {
		
		System.out.println();
		System.out.println("############ Part 5 #############");
		System.out.println();
		
		Queue queue = new Queue();
		PersonImpl p1 = new PersonImpl();
		p1.setVorname("Paul");
		PersonImpl p2 = new PersonImpl();
		p2.setVorname("Peter");
		PersonImpl p3 = new PersonImpl();
		p3.setVorname("Hans");
		
		
		System.out.println("Ist die Liste leer? - " +queue.empty());
		queue.add(p1);
		System.out.println(p1.getVorname() + " wurde hinzugefügt");
		System.out.println("Ist die Liste leer? - " +queue.empty());
		queue.add(p2);
		System.out.println(p2.getVorname() + " wurde hinzugefügt");
		System.out.println("Ist die Liste leer? - " +queue.empty());
		queue.add(p3);
		System.out.println(p3.getVorname() + " wurde hinzugefügt");
		System.out.println(queue.remove().getVorname() + " wurde entfernt");
		System.out.println(queue.head().getVorname() + " steht vorne");
	}
}
