package ar.edu.ort.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carrera c = new Carrera("Carrerita");
		c.agregarAtleta(new Atleta("Juan", (float) 3.5));
		c.agregarAtleta(new Atleta("Marcos", (float) 3.49));
		c.agregarAtleta(new Atleta("Pedro", (float) 4.5));
		c.agregarAtleta(new Atleta("Lucas", (float) 4));
		c.agregarAtleta(new Atleta("Maria", (float) 3.49));
		c.agregarAtleta(new Atleta("Magdalena", (float) 3.49));
		
		c.calcularGanadores();
	}

}
