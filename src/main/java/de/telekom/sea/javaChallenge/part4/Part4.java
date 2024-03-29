package de.telekom.sea.javaChallenge.part4;

public class Part4 {
	
	private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	private final String poem = String.join( "", 
	        "Whose woods these are I think I know.",
	        "His house is in the village, though;",
	        "He will not see me stopping here",
	        "To watch his woods fill up with snow.",
	        "",
	        "My little horse must think it's queer",
	        "To stop without a farmhouse near",
	        "Between the woods and frozen lake",
	        "The darkest evening of the year.",
	        "",
	        "He gives his harness bells a shake",
	        "To ask if there's some mistake.",
	        "The only other sound's the sweep",
	        "Of easy wind and downy flake.",
	        "",
	        "The woods are lovely, dark, and deep,",
	        "But I have promises to keep,",
	        "And miles to go before I sleep,",
	        "And miles to go before I sleep.");
		
	public void count(String str) {
		int i;
		for (char c : alphabet) {
			i=0;
			for (char v : str.toLowerCase().toCharArray()) {
				if (c==v) {
					i++;
				}				
			}
			System.out.println("Der Buchstabe " + c + " kommt " + i + " mal vor");			
		}
	}
	
	public void count() {
		count(poem);
	}
	
	public void run() {
		System.out.println();
		System.out.println("############ Part 4 #############");
		System.out.println();
		
		count(poem);
	}
}
