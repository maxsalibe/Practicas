package ar.edu.ort.ejercicio2;

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
	
	public void calcularGanadores() {
		float mejorTiempo = Float.MAX_VALUE;
		ArrayList<Atleta> ganadores = new ArrayList<>();
		for (Atleta atleta : competidores) {
			if (atleta.getTiempo() == mejorTiempo) {
				ganadores.add(atleta);
			} else if (atleta.getTiempo() < mejorTiempo) {
				mejorTiempo = atleta.getTiempo();
				ganadores.clear();
				ganadores.add(atleta);
			}
		}
		System.out.printf("Los ganadores de %s son:\n", this.nombreCarrera);
		for (Atleta atleta : ganadores) {
			System.out.println(atleta.getNombre());
		}
		
	}
}
