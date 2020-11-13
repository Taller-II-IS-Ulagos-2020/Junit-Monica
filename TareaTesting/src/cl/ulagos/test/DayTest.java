package cl.ulagos.test;

import cl.ulagos.hotel.Appointment;
import cl.ulagos.hotel.Day;

import cl.ulagos.hotel.Appointment_test4;
import cl.ulagos.hotel.Day_test4;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DayTest
{
	private Day day1;
	private Appointment a1;
	
	private Day_test4 dayb1;
	private Appointment_test4 b1;

	/**
	 * Default constructor for test class DayTest
	 */
	public DayTest()
	{
	}

	/**
	 * Sets up the test fixture.
	 *
	 * Called before every test case method.
	 */
	@BeforeEach
	public void setUp()
	{
		day1 = new Day(1);
		a1 = new Appointment("one hour appointment a1", 1);
		
		dayb1 = new Day_test4(1);
		b1 = new Appointment_test4("media hora b1",0.5);

		
	}

	public void fillDay(){
		Appointment a2,a3,a4,a5,a6,a7,a8,a9;
		a2 = new Appointment("a2", 1);
		a3 = new Appointment("a3", 1);
		a4 = new Appointment("a4", 1);
		a5 = new Appointment("a5", 1);
		a6 = new Appointment("a6", 1);
		a7 = new Appointment("a7", 1);
		a8 = new Appointment("a8", 1);
		a9 = new Appointment("a9", 1);
		day1.makeAppointment(9, a1);
		day1.makeAppointment(10, a2);
		day1.makeAppointment(11, a3);
		day1.makeAppointment(12, a4);
		day1.makeAppointment(13, a5);
		day1.makeAppointment(14, a6);
		day1.makeAppointment(15, a7);
		day1.makeAppointment(16, a8);
		day1.makeAppointment(17, a9);
	}

	/*@Test
	public void t4a_firstAppointmentInEmptyDayShouldSucceed()
	{
		//given: empty day 
		// (from setup)
		// when: make appointment
		boolean success = day1.makeAppointment(9, a1);
		// then: is successfull
		assertEquals(true,success );
	}

	@Test
	public void t4b_firstAppointmentInEmptyDayShouldActuallyScheduleAppointment()
	{
		//given: empty day 
		// (from setup)
		// when: make appointment
		boolean success = day1.makeAppointment(9, a1);
		// then: appoint is scheduled
		assertEquals(a1, day1.getAppointment(9) );
	}

	@Test
	public void t5_appointmentTooEarlyShouldFail()
	{
		//given: empty day 
		// (from setup)
		// when: make appointment @ 800
		boolean success = day1.makeAppointment(8, a1);
		// then: is not successfull
		assertEquals(false,success );
	}

	@Test
	public void t6_appointmentTooLateShouldFail()
	{
		//given: empty day 
		// (from setup)
		// when: make appointment @ 800
		boolean success = day1.makeAppointment(18, a1);
		// then: is not successfull
		assertEquals(false,success );
	}

	@Test
	public void t7a_secondAppointmentInNonEmptySlotFails()
	{
		//given: day w/ app. @1100
		Appointment originalAppointment = new Appointment("first",1);
		day1.makeAppointment(11, originalAppointment);
		// when: make appointment
		boolean success = day1.makeAppointment(11, a1);
		// then: is successfull
		assertEquals(false,success );
	}

	@Test
	public void t7b_secondAppointmentInNonEmptySlotLeavesFirstAppointment()
	{
		//given: day w/ app. @1100
		Appointment originalAppointment = new Appointment("first",1);
		day1.makeAppointment(11, originalAppointment);
		// when: make appointment
		boolean success = day1.makeAppointment(11, a1);
		// then: appoint not scheduled
		assertEquals(originalAppointment, day1.getAppointment(11) );
	}

	@Test
	public void t8_findSpaceInEmptyDayShouldReturnFirstSlot(){
		// given empty day
		// when findSpace for 2h appointment
		int actual = day1.findSpace(new Appointment("lasts 2 h",2));
		// then should return 900
		assertEquals(9,actual);

	}

	@Test
	public void t9_longerAppointmentOverlappingOtherShouldFail(){
		//given appointment @ 1200
		day1.makeAppointment(12,a1);
		//when makeAppointment 900-1400 (5h @ 900)
		Appointment longAppointment = new Appointment("loooong",5);
		boolean actual =   day1.makeAppointment(9,longAppointment);
		//then should fail
		assertEquals(true, actual);
	}*/
	
	//TEST TAREA DE TESTING
	
	/* verificar que findSpace retorne el valor 10 para una cita de una hora,
	 si en el día ya se cuenta con una cita a las 9am */
	@Test
	public void mitest01()
	{
		Appointment originalAppointment = new Appointment("first",1);
		day1.makeAppointment(9, originalAppointment);
		int retorno = day1.findSpace(a1);
		assertEquals(10,retorno);
	}
	
	/* Verificar que el método findSpace retorna el valor de -1,
	 si se hace un intento de agendar una cita en un día que esté lleno.*/
	@Test
	public void mitest02()
	{
		fillDay();
		Appointment originalAppointment = new Appointment("first",1);
		int retorno = day1.findSpace(originalAppointment);
		assertEquals(-1,retorno);
	}
	
	/*Crear un test negativo (usar la instrucción assertFalse) para el siguiente caso. 
	  Intentar inicializar una cita de un ahora y luego poner una cita de dos horas a la misma hora.
 	  Que sucede cuando corre el test? Incluir un screenshot en el reporte.*/
	@Test
	public void mitest03()
	{
		day1.makeAppointment(9, a1);
		Appointment originalAppointment = new Appointment("first",2);
		boolean retorno = day1.makeAppointment(9, originalAppointment);		
		assertFalse(retorno);
	}
	
	
	/* 
	 * Para realizar los test 04_x se utilizaran las clases modificadas
	 * llamadas Appointment_test4 y Day_test4 
	 * las cuales fueron adaptadas para que se acepten citas de media hora
	*/
	
	// verifica que se pueda crear una cita de media hora
	@Test
	public void mitest04_a()
	{
		Appointment_test4 prueba = new Appointment_test4("prueba",0.5);
		//Appointment_test4 prueba2 = new Appointment_test4("prueba2", 1);
		boolean retorno = dayb1.makeAppointment(9, prueba);		
		assertEquals(true,retorno);
	}
	//verifica que se pueda crear cita de una hora, con inicio no entero
	@Test
	public void mitest04_b()
	{
		Appointment_test4 prueba = new Appointment_test4("prueba",1);
		boolean retorno = dayb1.makeAppointment(9.5, prueba);		
		assertEquals(true,retorno);
	}
	
	//verifica que se encuentre un espacio que no sea entero
	@Test
	public void mitest04_c()
	{
		Appointment_test4 prueba = new Appointment_test4("prueba",1.5);
		dayb1.makeAppointment(9, prueba);
		double retorno = dayb1.findSpace(b1);
		boolean resp = (retorno == 10.5);
		assertEquals(true,resp);
	}
	
	//verificar que no se puedan poner dos citas a la misma hora.
 	@Test		  
	public void mitest04_d()
	{
		dayb1.makeAppointment(10.5, b1);
		Appointment_test4 prueba = new Appointment_test4("prueba",1);
		boolean retorno = dayb1.makeAppointment(10.5, prueba);
		assertFalse(retorno);
	}
	
}

