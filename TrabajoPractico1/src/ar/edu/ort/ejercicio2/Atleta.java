package ar.edu.ort.ejercicio2;

public class Atleta {
	private String nombre;
	private float tiempo;
	
	public Atleta(String nombre, float tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public float getTiempo() {
		return this.tiempo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
