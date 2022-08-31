package ar.edu.ort.ejercicio3;

import java.util.ArrayList;

public class Carrera {
	private String nombreCarrera;
	private ArrayList<Atleta> competidores;
	
	public Carrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
		this.competidores = new ArrayList<>();
	}
	
	public void agregarAtleta(Atleta atleta) {
		if (atleta != null) {
		this.competidores.add(atleta);
		}
	}
	
	public void calcularPodio() {
		ArrayList<Atleta> primerPuesto = new ArrayList<>();
		ArrayList<Atleta> segundoPuesto = new ArrayList<>();
		ArrayList<Atleta> tercerPuesto = new ArrayList<>();
		float tiempo1 = Float.MAX_VALUE;
		float tiempo2 = Float.MAX_VALUE;
		float tiempo3 = Float.MAX_VALUE;
		for (Atleta atleta : competidores) {
			if (atleta.getTiempo() < tiempo1) {
				tiempo3 = tiempo2;
				tiempo2 = tiempo1;
				tiempo1 = atleta.getTiempo();
				tercerPuesto = segundoPuesto;
				segundoPuesto = primerPuesto;
				primerPuesto = new ArrayList<>();
				primerPuesto.add(atleta);
			} else if (atleta.getTiempo() == tiempo1) {
				primerPuesto.add(atleta);
			} else if (atleta.getTiempo() < tiempo2) {
				tercerPuesto = segundoPuesto;
				segundoPuesto = new ArrayList<>();
				segundoPuesto.add(atleta);
			} else if (atleta.getTiempo() == tiempo2) {
				segundoPuesto.add(atleta);
			} else if (atleta.getTiempo() < tiempo3) {
				tercerPuesto = new ArrayList<>();
				tercerPuesto.add(atleta);
			} else if (atleta.getTiempo() == tiempo3) {
				tercerPuesto.add(atleta);
			}
		}
		System.out.println("Resultados de la carrera " + this.nombreCarrera);
		System.out.println("Primer puesto:");
		for (Atleta atleta : primerPuesto) {
			System.out.println(atleta.getNombre());
		}
		System.out.println("Segundo puesto:");
		for (Atleta atleta : segundoPuesto) {
			System.out.println(atleta.getNombre());
		}
		System.out.println("Tercer puesto:");
		for (Atleta atleta : tercerPuesto) {
			System.out.println(atleta.getNombre());
		}

		
	}
}
