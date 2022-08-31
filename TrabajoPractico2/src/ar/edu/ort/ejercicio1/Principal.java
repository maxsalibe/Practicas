package ar.edu.ort.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Maximiliano", "Salibe");
		p.agregarEmail(new Email("salibemaximiliano@gmail.com"));
		p.agregarEmail(new Email("maximilianosalibe@hotmail.com"));
		p.agregarTelefono(new NumeroTelefonico(781, 4666, 54, TipoDeLinea.FIJO));
		p.agregarTelefono(new NumeroTelefonico(787, 5504, 123, TipoDeLinea.CELULAR));
		p.agregarTelefono(new NumeroTelefonico(81, 1542, 454, TipoDeLinea.FAX));
		p.mostrarTodo();
	}

}
