package ar.edu.ort.ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vivienda v1 = new Vivienda(new Direccion("Diaz Velez", "1234", "10", "Z"));
		v1.agregarPersona(new Persona("Marcelino", "Gomez", 49));
		v1.agregarMueble(new Mueble("Cama", "madera", "negro"));
		v1.agregarMueble(new Mueble("Mesa", "hierro", "blanco"));
		v1.agregarMueble(new Mueble("Silla", "carton", "transparente"));
		v1.agregarPersona(new Persona("Alessandra", "Fraticelli", 23));
		v1.mostrar();
	}

}
