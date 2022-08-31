package ar.edu.ort.ejercicio3;

import java.util.ArrayList;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> involucrados;
	
	public Hito(String fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.involucrados = new ArrayList<>();
	}
	
	public void agregarInvolucrado(Persona p) {
		this.involucrados.add(p);
	}
}
