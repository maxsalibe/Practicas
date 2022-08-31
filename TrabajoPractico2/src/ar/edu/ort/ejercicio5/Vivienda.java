package ar.edu.ort.ejercicio5;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
	}
	
	public void agregarPersona(Persona p) {
		this.personas.add(p);
	}
	
	public void agregarMueble(Mueble m) {
		this.muebles.add(m);
	}
	
	private void mostrarPersonas() {
		for (Persona p : this.personas) {
			System.out.println(p.mostrar());
		}
	}
	
	private void mostrarMuebles() {
		for (Mueble m : this.muebles) {
			System.out.println(m.mostrar());
		}
	}
	
	public void mostrar() {
		System.out.println("Vivienda:");
		System.out.println("Direccion: " + this.direccion.mostrar());
		System.out.println("Personas: ");
		mostrarPersonas();
		System.out.println("Muebles: ");
		mostrarMuebles();
	}
	
	
}
