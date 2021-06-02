package de.telekom.sea.javaChallenge.part2;

public class PrimitiveDatatype {
	private String name;
	private int sizeInByte;
	
	public PrimitiveDatatype (String name, int size) {
		this.name=name;
		this.sizeInByte=size;
	}
	
	public String getName() {
		return name;
	}

	public int getSizeInByte() {
		return sizeInByte;
	}
	
	public String toString() {
		return String.format("%s: %s Byte(s)", name, sizeInByte);
	}
}
