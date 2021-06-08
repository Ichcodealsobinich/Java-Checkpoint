package de.telekom.sea.javaChallenge.part5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueIterator<T> implements Iterator<T>{

	private Queue<T> q;
	
	public boolean hasNext() {
		return !q.empty();
	}
	
	public T next() throws NoSuchElementException{
		if (!q.empty()) {
			return q.remove();
		} else {
			throw new NoSuchElementException();
		}
	}
	
	QueueIterator(Queue<T> queue){
		this.q = queue;
	}
}
