package de.telekom.sea.javaChallenge.part2;

public class Part2 {
	final PrimitiveDatatype[] types = new PrimitiveDatatype[8];
	
	public Part2() {
		types[0] = new PrimitiveDatatype("boolean", 1);
		types[1] = new PrimitiveDatatype("byte", 1);
		types[2] = new PrimitiveDatatype("short", 2);
		types[3] = new PrimitiveDatatype("int", 4);
		types[4] = new PrimitiveDatatype("long", 8);
		types[5] = new PrimitiveDatatype("float", 4);
		types[6] = new PrimitiveDatatype("double", 8);
		types[7] = new PrimitiveDatatype("char", 2);
	}
	
	public void sortBySize() {
		for (int i=1; i<9; i++) {
			for (PrimitiveDatatype type : types) {
				if (i==type.getSizeInByte()) {
					System.out.println(type.toString());
				}
			}
		}
	}
}
