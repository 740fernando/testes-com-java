package com.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {
	
	@Test
	public void deveSomarDoisValores() {
		int valorA = 1;
		int valorB = 2;
		
		CalculadoraNova calc = new CalculadoraNova();
		
		
		assertEquals(3, calc.somar(valorA, valorB));		
	}
	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		
		CalculadoraNova calc = new CalculadoraNova();
		
		
		assertEquals(6, calc.somar(valorA, valorB, valorC));		
	}
}
