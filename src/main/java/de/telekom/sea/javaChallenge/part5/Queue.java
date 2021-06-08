package de.telekom.sea.javaChallenge.part5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Queue<T> implements Queueable<T> , Iterable<T>{
	
	/* This list does all the heavy lifting for us...
	 */
	private List<T> list = new LinkedList<T>();
	
	/* Adds a person if the reference to that person 
	 * is not null and the list is not full.
	 * Otherwise it does nothing. Since the interface 
	 * definition says there is no return value and
	 * no exception, we cannot inform the caller about
	 * success or failure
	 */
	public void add (T t) {
		if (t != null) {
			list.add(t);
		}
	}
	
	/* The head of the list is always at index 0.
	 * Hence, we can return the person at position 0
	 * if there is one. 
	 * Otherwise we have to return null, because we 
	 * cannot throw an exception.
	 */
	public T head() {
		if (list.size() > 0) {return list.get(0);}
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
	public T remove() {		
		if (list.size() > 0) {
			return list.remove(0);
		}
		else {
			return null;
		}
	}
	
	/* Resets the list to a new array and 
	 * sets the count to 0.
	 */
	public void reset() {
		list = new LinkedList<T>();
	}
	
	/* Tells the caller if there is no
	 * person in the list
	 */
	public boolean empty() {
		return list.isEmpty();
	}
	
	public Iterator<T> iterator() {
		return new QueueIterator<T>(this);
		// This would be to easy: return list.iterator();
	}
	
	/* Iterates through the array and 
	 * compares the references of each person
	 * with the given person.
	 * This method does not compare the content
	 * of the persons.
	 */
	public int search(T t) {
		for (int i=0; i<list.size(); i++) {
			if (t==list.get(i)) {
				return i;
			}
		}
		return -1;		
	}
}
