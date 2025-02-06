package orientacion_objeto;

public class GestionaEquipo {

	public static void main(String[] args) {
		Persona p1 = new Persona("Andrea", "Perea", "12345678C");
		Persona p2 = new Persona("Luis", "Perea", "12345678D");
		Persona p3 = new Persona("David", "Perez", "12345678A");
		Persona p4 = new Persona("Sebastian", "Rodriguez", "12345678X");
		
		Persona[] personas1 = {p1, p2};
		Persona[] personas2 = {p3, p4};
		
		int[] puntuacion1 = {7,14,22};
		int[] puntuacion2 = {40,12,3};
		
		Equipo equipo1 = new Equipo("equipo1", puntuacion1, personas1);
		System.out.println(equipo1);
		Persona[]tablaPersona = equipo1.participantes;
		
	}

}
