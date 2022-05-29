package com.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}
}
/**
 * assertEquals - 
 *  - Afirmacao : metodo para testar o resultado esperado
 *  - Asserions : para tipos primitivos, Objetos e arrays
 *  - Import static
 *  - Ordem dos parametros : Valor Esperado, Valor Atual
 */
