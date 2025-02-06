package paquete2;

public class GestionaAnimales {

	public static void main(String[] args) {
		animal perro = new animal();
		// perro.edad; No visible por que es private
		perro.nombre = "lulu"; // Funciona
		perro.tipo = "perro";
		// perro.tipo Tiene visibilidad por defecto y estamos en otro paquete

		animal gato = new animal();
		gato.nombre = "Boni";
		gato.tipo = "gato";
		
		
		
		boolean anda = perro.caminar();
		System.out.println(anda);
		//perro.darDeComer();
		
		boolean mismoTipo = perro.sonDelMismoTipo(gato, 0);
		System.out.println(mismoTipo);

	}

}
