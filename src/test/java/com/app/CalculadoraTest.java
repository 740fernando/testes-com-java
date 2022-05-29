package com.app;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;


public class CalculadoraTest {
	
	/**
	 * assertEquals - 
	 *  - Afirmacao : metodo para testar o resultado esperado
	 *  - Asserions : para tipos primitivos, Objetos e arrays
	 *  - Import static
	 *  - Ordem dos parametros : Valor Esperado, Valor Atual
	 */
	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}
	
	/**
	 * mock - objetos simulados, é um termo utilizado para descrever quando simulamos o comportamento de objetos reais
	 * de forma controlada
	 */
	@Test
	public void testSomarCondMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2")).thenReturn(10);
		
		int resultado = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
					
	}
}

