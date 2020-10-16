package cl.ulagos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.ulagos.aplication.Identificador;

public class UsoBeforeCaseTest {
	
	// c1: para no redundar los inicializadores en cada test
	Identificador id;
	//se ejecuta antes de cada test
	@BeforeEach
	public void inicializador() {
		id = new Identificador();
		System.out.println("Inicializado");
	}
	// c1: hasta aqui
	
	@Test
	public void particionValida() {
		//Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("a1");
		assertEquals(true,resultado);
	}
	
	@Test
	public void particionInvalida01() {
		//Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("");
		assertEquals(false,resultado);
	}
	
	@Test
	public void particionInvalida02() {
		//Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("A1b2C3d");
		assertEquals(false,resultado);
	}
	
	@Test
	public void particionInvalida03() {
		//Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("2B3");
		assertEquals(false,resultado);
	}
	
	@Test
	public void particionInvalida04() {
		//Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("z#12");
		assertEquals(false,resultado);
	}
	
	//ejecuta despues de cada test
	@AfterEach
	public void limpiar() {
		System.out.println("Limpiar");
	}

}
