package com.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("text","text");
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}
	
	/**
	 * Verfica se os objetos nao sao os mesmo
	 */
	@Test
	public void testAssertNotNull() {
		assertNotSame(new Object(), new Object());
	}
	@Test
	public void testAssertNull() {
		assertNull(null);
	}
	
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(763);
		assertSame(aNumber, aNumber);
	}
}
