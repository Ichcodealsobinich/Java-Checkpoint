package de.telekom.sea.javaChallenge.part5;

public class Part5 implements PersonenSchlange{
	private Person[] personen = new Person[8];
	private int count;
	
	/* Adds a person if the reference to that person 
	 * is not null and the list is not full.
	 * Otherwise it does nothing. Since the interface 
	 * definition says there is no return value and
	 * no exception, we cannot inform the caller about
	 * success or failure
	 */
	public void add (Person person) {
		if (person != null && count < 8) {
			personen[count] = person;
			count++;
		}
	}
	
	/* The head of the list is always at index 0.
	 * Hence, we can return the person at position 0
	 * if there is one. 
	 * Otherwise we have to return null, because we 
	 * cannot throw an exception.
	 */
	public Person head() {
		if (count > 0) {return personen[0];}
		else {return null;}
	}
	
	/* The head of the list is always at index 0.
	 * Hence, we can memorize the person at position 0
	 * if there is one and then remove it. We make use 
	 * of the helper-method "shiftLeft" and then 
	 * decrease the number of persons. 
	 * If there is no person, we have to return null, because we 
	 * cannot throw an exception.
	 */
	public Person remove() {		
		if (count > 0) {
			Person p =  personen[0];
			shiftLeft();
			count--;
			return p;}
		else {
			return null;
		}
	}
	
	/* This is a helper function to shift all persons
	 * to the left (index-1). It is used, when a person
	 * is removed from the list.
	 * */
	private void shiftLeft() {
		for (int i=0; i<count;i++)
			personen[i] = personen[i+1];
	}
	
	/* Resets the list to a new array and 
	 * sets the count to 0.
	 */
	public void reset() {
		personen = new Person[8];
		count = 0;
	}
	
	/* Tells the caller if there is no
	 * person in the list
	 */
	public boolean empty() {
		return count==0;
	}
	
	/* Iterates through the array and 
	 * compares the references of each person
	 * with the given person.
	 * This method does not compare the content
	 * of the persons.
	 */
	public int search(Person person) {
		for (int i=0; i<count; i++) {
			if (person==personen[i]) {
				return i;
			}
		}
		return -1;		
	}
}
