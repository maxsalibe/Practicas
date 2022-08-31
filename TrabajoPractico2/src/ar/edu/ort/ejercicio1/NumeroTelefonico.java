package ar.edu.ort.ejercicio1;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(int car, int num, int pais, TipoDeLinea tipo) {
		this.caracteristica = car;
		this.numeroDeAbonado = num;
		this.codigoDePais = pais;
		this.tipoDeLinea = tipo;
	}
	
	public String getValor() {
		return String.format("%s: (+%03d) %4s-%4s", this.tipoDeLinea, this.codigoDePais, this.caracteristica, this.numeroDeAbonado);
	}
}
