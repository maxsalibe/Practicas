package ar.edu.ort.ejercicio2.archivos;

import ar.edu.ort.ejercicio2.Dimension;
import ar.edu.ort.ejercicio2.FormatoVideo;

public class ArchivoVideo extends ArchivoMultimedia {
	
	private Dimension dimension;
	private FormatoVideo formato;
	
	public ArchivoVideo(String nombre, double peso, String path, int duracion, Dimension dimension,
			FormatoVideo formato) {
		super(nombre, peso, path, duracion);
		this.dimension = dimension;
		this.formato = formato;
	}

	public boolean sosFullHD() {
		return dimension.sosFullHD();
	}
	
	
}
