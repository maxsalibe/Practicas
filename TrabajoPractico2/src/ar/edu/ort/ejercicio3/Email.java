package ar.edu.ort.ejercicio3;

public class Email {
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		this.cuenta = email.split("@")[0];
		this.dominio = email.split("@")[1];
	}
	
	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}
}
