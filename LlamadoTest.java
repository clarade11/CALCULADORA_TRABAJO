package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Llamado;


class LlamadoTest {

	Llamado ll = new Llamado();
	
	@Test
	void test_suma() {
		assertEquals(ll.suma(1, 1), 2.0, "El resultado esta mal ");
	}
	
	@Test
	void test_resta() { //COLOCADO MAL QUERIENDO
		assertEquals(ll.resta(1, 1), 2.0, "El resultado esta mal ");
	}
	
	@Test
	void test_mul() {
		assertEquals(ll.mul(1, 1), 1.0, "El resultado esta mal ");
	}
	
	@Test
	void test_div() {
		assertEquals(ll.div(1, 1), 1.0, "El resultado esta mal ");
	}

}
