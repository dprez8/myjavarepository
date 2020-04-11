package paquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class testing {

	@Test
	void test() {
		String hol="hola";
		String per="hola";
		
		assertTrue(hol.equals(per));
	}

	
	@Test
	void test2() {
		Persona ale=new Persona(15,"Ale");
		assertTrue(ale.verEdad());
		
	}
	
}
