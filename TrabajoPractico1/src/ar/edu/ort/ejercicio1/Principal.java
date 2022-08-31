package ar.edu.ort.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Grupo g = new Grupo("Los fantasticos");
		agregarIntegrante(g, "Denise Eljatib");
		agregarIntegrante(g, "Maximiliano Salibe");
		agregarIntegrante(g, "Sergio Camejo");
		agregarIntegrante(g, "Julio Dorado Ayala");
		agregarIntegrante(g, "Elvis Presley");
		
		comprobarIntegrante(g, "Denise Eljatib");
		comprobarIntegrante(g, "Marcelo Tinelli");
		
		g.mostrar();
		
		removerIntegrante(g, "Elvis Presley");
		removerIntegrante(g, "Elvis Presley");
		
		g.vaciar();
		g.mostrar();
	}
	
	public static void agregarIntegrante(Grupo grupo, String integrante) {
		grupo.agregarIntegrante(integrante);
		System.out.printf("%s fue asignado al grupo %s.\n", integrante, grupo.getNombre());
	}
	public static void comprobarIntegrante(Grupo grupo, String nombre) {
		System.out.printf("\n%s %s en el grupo %s.\n", nombre, 
				grupo.buscarIntegrante(nombre) != null ?
						"esta" : "no esta", grupo.getNombre());

	}
	
	public static void removerIntegrante(Grupo g, String integrante) {
		String removido = g.removerIntegrante(integrante);
		if (removido == null) {
			System.out.println("\nNo se pudo remover al integrante " + integrante + " porque no existia.");
		} else {System.out.println("\nSe ha removido al integrante " + integrante + ".");
		}
		g.mostrar();
	}
	
	

}
