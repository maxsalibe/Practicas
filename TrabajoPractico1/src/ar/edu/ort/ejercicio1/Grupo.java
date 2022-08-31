package ar.edu.ort.ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) {
		setNombre(nombre);
		this.integrantes = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if (buscarIntegrante(nombreIntegrante) == null) {
			this.integrantes.add(nombreIntegrante);
		}
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = -1;
		int i = 0;
		while (i < this.integrantes.size() && posicion == -1) {
			if (this.integrantes.get(i).equals(nombreIntegrante)) {
				posicion = i + 1;
			} else {
				i++;
			}
		}
		return posicion;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		if (posicion > 0 && posicion <= this.integrantes.size()) {
			integrante = this.integrantes.get(posicion - 1);
		}
		return integrante;
	}
	
	public String buscarIntegrante(String nombre) {
		String encontrado = null;
		int i = 0;
		while (i < this.integrantes.size() && encontrado == null) {
			if (this.integrantes.get(i).equals(nombre)) {
				encontrado = this.integrantes.get(i);
			} else {
				i++;
			}
		}
		return encontrado;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
//		String removido = null;
//		String aRemover = buscarIntegrante(nombreIntegrante);
//		if (aRemover != null) {
//			this.integrantes.remove(aRemover);
//			removido = aRemover;
//		}
//		return removido;

//		 version que usa el metodo obtenerPosicionIntegrante
		 String removido = null;
		 int posicion = obtenerPosicionIntegrante(nombreIntegrante);
		 if (posicion != -1) {
			removido = this.integrantes.remove(posicion - 1);
		 }
		 return removido;
	}
	
	private void mostrarIntegrantes() {
		System.out.printf("El grupo tiene %d integrantes,\ncuyos nombres son:\n", this.integrantes.size());
		for (int i = 0; i < this.integrantes.size(); i++) {
			System.out.println(this.integrantes.get(i));
		}
	}
	
	public void mostrar() {
		System.out.printf("\nEl grupo se llama %s\n", this.nombre);
		mostrarIntegrantes();
	}
	
	public void vaciar() {
		this.integrantes.clear();
	}
}
