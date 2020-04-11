package paquete;

public class Persona {

	int edad;
	String name;
	
	
	
	public Persona(int edad, String name) {
		super();
		this.edad = edad;
		this.name = name;
	}



	public boolean verEdad() {
		return edad==15;
	}
}
