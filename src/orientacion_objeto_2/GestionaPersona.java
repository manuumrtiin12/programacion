package orientacion_objeto_2;

public class GestionaPersona {

	public static void main(String[] args) {

		Persona p = new Persona("Pepe", "palotes", 30000, 30, "Pepe@gmil.com");
		Persona p2 = new Entrenador("Francisco", "palotes", 30000, 30, "Fran@gmil.com");
		Entrenador e = new Entrenador("Manuel", "palotes", 30000, 30, "Manu@gmil.com");
		
		System.out.println(p2.toString());
		
		p.Concentrarse();
		p2.Concentrarse();
		e.Concentrarse();
		
		p.viajar();
		p2.viajar();
		e.viajar();
		
		e.dirigirPartido();
		Entrenador p2toEntrenador = (Entrenador)p2;
		p2toEntrenador.dirigirPartido();
	
		
	}
}
