package ar.edu.ort.ejercicio1;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();
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
	}
	
	public void agregarTelefono(NumeroTelefonico telefono) {
		this.telefonos.add(telefono);
	}	
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
}
