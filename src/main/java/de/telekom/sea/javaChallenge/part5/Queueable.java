package de.telekom.sea.javaChallenge.part5;

public interface Queueable<T> {

    public void add(T t);

    public T head();

    public T remove();

    public void reset();

    public boolean empty();

    public int search(T t);

}
