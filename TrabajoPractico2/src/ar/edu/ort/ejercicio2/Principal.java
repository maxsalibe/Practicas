package ar.edu.ort.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Maximiliano", "Salibe");
		p.agregarEmail(new Email("salibemaximiliano@gmail.com"));
		p.agregarEmail(new Email("maximilianosalibe@hotmail.com"));
		p.agregarMascota(new Mascota("Toy", "Perro"));
		p.agregarTelefono(new NumeroTelefonico(781, 4666, 54, TipoDeLinea.FIJO));
		p.agregarTelefono(new NumeroTelefonico(787, 5504, 123, TipoDeLinea.CELULAR));
		p.agregarMascota(new Mascota("Nazca", "Gato"));
		p.agregarTelefono(new NumeroTelefonico(81, 1542, 454, TipoDeLinea.FAX));
		p.mostrarTodo();
	}

}
