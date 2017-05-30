package com.datapak.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testgetMessage() {
		
		String expected = "Hello, Person!";
		
		assertEquals(expected, HelloWorld.getMessage("Person"));
	}

}
