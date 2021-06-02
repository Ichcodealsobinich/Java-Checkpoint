package de.telekom.sea.javaChallenge.part5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.telekom.sea.javaChallenge.part5.*;



public class Part5_Test {
	
	private Queue cut;
	
	@BeforeEach
	void setup() {
		cut = new Queue();
	}
	
	@Test
	void addTest() {
		//Arrange
		Person p1 = new PersonImpl();

		//Act
		cut.add(p1);
		
		//Assert
		assertEquals(p1,cut.head());
		assertFalse(cut.empty());
		assertEquals(p1,cut.remove());
	}
	
	@Test
	void headTest() {
		//Arrange
		Person p1 = new PersonImpl();
		Person p2 = new PersonImpl();
		//Act
		cut.add(p1);
		cut.add(p2);
		
		//Assert
		assertEquals(p1,cut.head());
		assertFalse(cut.empty());
		assertEquals(p1,cut.remove());
		assertEquals(p2,cut.head());
	}
	
	@Test
	void removeTest() {
		//Arrange
		Person p1 = new PersonImpl();
		Person p2 = new PersonImpl();
		//Act
		cut.add(p1);
		cut.add(p2);
		
		//Assert
		assertEquals(p1,cut.head());
		assertFalse(cut.empty());
		assertEquals(p1,cut.remove());
		assertEquals(p2,cut.head());
		assertEquals(p2,cut.remove());
		assertNull(cut.head());
		assertTrue(cut.empty());
	}
	
	@Test
	void resetTest() {
		//Arrange
		Person p1 = new PersonImpl();
		//Act
		cut.add(p1);
		cut.reset();
		
		//Assert
		assertTrue(cut.empty());
		assertNull(cut.head());
		assertNull(cut.remove());
	}
	
	@Test
	void emptyTest() {
		//Arrange
		Person p1 = new PersonImpl();
		
		//Act
		assertTrue(cut.empty());
		cut.add(p1);
		
		//Assert
		assertFalse(cut.empty());
	}
	
	@Test
	void searchTest() {
		//Arrange
		Person p1 = new PersonImpl();
		Person p2 = new PersonImpl();
		
		//Act
		cut.add(p1);
		cut.add(p2);
		
		//Assert
		assertEquals(0,cut.search(p1));
		assertEquals(1,cut.search(p2));
	}
	
	@AfterEach
	void teardown() {
		cut = null;
	}
	
}
