package ar.edu.ort.ejercicio3;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;
	
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
		this.hitos = new ArrayList<>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);
		System.out.println("Telefonos:");
		for (NumeroTelefonico numero : telefonos) {
			System.out.println(numero.getValor());
		}
		for (Email email : emails) {
			System.out.println(email.getValor());
		}
		System.out.println("Mascotas:");
		for (Mascota m : this.mascotas) {
			System.out.println(m.mostrar());
		}
	}
	
	public void agregarTelefono(NumeroTelefonico telefono) {
		this.telefonos.add(telefono);
	}	
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public void agregarHito(Hito h) {
		this.hitos.add(h);
	}
}
