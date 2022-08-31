package ar.edu.ort.ejercicio2;

public class Mascota {
	private String nombre;
	private String tipo;
	
	public Mascota(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String mostrar() {
		return this.tipo + ", " + this.nombre;
	}
}
