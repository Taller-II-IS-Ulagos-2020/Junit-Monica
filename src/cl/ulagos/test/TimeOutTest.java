package cl.ulagos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import cl.ulagos.aplication.Identificador;

public class TimeOutTest {
	
	Identificador id;
	public static final int LIMITE = 100;
	
	public void inicializa() {
		id = new Identificador();
	}
	
	@Test
	@Timeout(value = LIMITE, unit = TimeUnit.MILLISECONDS)
	public void ParticionValida() throws Exception{
		
		TimeUnit.MILLISECONDS.sleep(101);
		boolean resultado = id.validarIdentificador("1ed");
		assertEquals(true,resultado);
	}
	
	@Test
	@Timeout(value = LIMITE, unit = TimeUnit.MILLISECONDS)
	public void ParticionInvalida01() throws Exception {
		
		TimeUnit.MILLISECONDS.sleep(101);
		boolean resultado = id.validarIdentificador("");
		assertEquals(false, resultado);
	}
	
	@Test
	@Timeout(value = LIMITE, unit = TimeUnit.MILLISECONDS)
	public void ParticionInvalida02() throws Exception {
		
		TimeUnit.MILLISECONDS.sleep(101);
		boolean resultado = id.validarIdentificador("A1b2C3d");
		assertEquals(false,resultado);
	}
	
	@Test
	@Timeout(value = LIMITE, unit = TimeUnit.MILLISECONDS)
	public void ParticionInvalida03() throws Exception{
		
		TimeUnit.MILLISECONDS.sleep(101);
		boolean resultado = id.validarIdentificador("2B3");
		assertEquals(false, resultado);
	}
	
	@Test
	@Timeout(value = LIMITE, unit = TimeUnit.MILLISECONDS)
	public void particionInvalida04() throws Exception {

		TimeUnit.MILLISECONDS.sleep(101);
		boolean resultado = id.validarIdentificador("z#12");
		assertEquals(false,resultado);
	}
	
	

}
