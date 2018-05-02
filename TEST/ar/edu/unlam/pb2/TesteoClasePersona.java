package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TesteoClasePersona {

	@Test
	public void testPesoIdeal() {
		Persona persona1 = new Persona("Roberto", 32, "34587422", 'H', 72.0, 1.75);
		Integer esperado=0;
		Integer actual=persona1.calcularIMC();
		assertEquals(esperado, actual);
	}
	@Test
	public void testSobrepeso(){
		Persona persona2 = new Persona("Jorge", 42, "27458120", 'H', 144.3, 1.50);
		Integer esperado=1;
		Integer actual=persona2.calcularIMC();
		assertEquals(esperado, actual);
	}
	@Test
	public void testBajoPeso(){
		Persona persona3 = new Persona("Marta", 18, "43587222", 'M', 51.1, 1.72);
		Integer esperado=-1;
		Integer actual=persona3.calcularIMC();
		assertEquals(esperado,actual);
	}
	@Test
	public void testMayoriaDeEdad(){
		Persona persona4 = new Persona("Susana", 23, 'M');
			assertTrue(persona4.esMayorDeEdad());
		Persona persona5 = new Persona("Charlie", 11, 'H');
			assertFalse(persona5.esMayorDeEdad());
			System.out.println(persona4); //Lo puse para ver si funcionaba bien lo del dni
	}
}
