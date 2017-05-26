package com.datapak.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testgetMessage() {
		
		
		assertEquals("Hello World!", HelloWorld.getMessage());
	}

}
