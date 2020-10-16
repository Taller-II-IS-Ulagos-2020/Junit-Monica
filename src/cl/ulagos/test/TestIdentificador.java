package cl.ulagos.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cl.ulagos.aplication.Identificador;

public class TestIdentificador {

	@Test
	public void primerTest() {
		
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("abc");
		//debe arrojar true
		assertEquals(true,resultado);
		
	}
	
	@Test
	public void segundoTest() {
		
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("1de");
		//debe arrojar false
		assertEquals(false,resultado);
		
	}
	@Test
	public void tercerTest() {
		
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador(null);
		//debe arrojar false
		assertEquals(false,resultado);
	}
	
	
}
