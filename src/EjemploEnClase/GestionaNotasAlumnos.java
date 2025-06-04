package EjemploEnClase;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionaNotasAlumnos {

	public static void main(String[] args) {

		Map<Persona, Nota> m = new HashMap<Persona, Nota>();
		Persona carla = new Persona("Carla");
		Persona sofia = new Persona("Sofia");
		Persona pedro = new Persona("Pedro");

		Nota n1 = new Nota(5);
		Nota n2 = new Nota(7);

		m.put(carla, n2);
		m.put(pedro, n2);
		m.put(sofia, n1);

	}

	List<Persona> getAlumnosPorEncimaNota(float nota) {
		
		
	}

	float calculaNotaMedia(Map<Persona, Nota> m) {
		float media = 0;
		Collection<Nota> notas = m.values();
		for (Nota n : notas) {
			media = n.getNota();
		}
		media = media / notas.size();
		return media;
	}
}