package orientacion_objeto;

import java.util.Arrays;

public class Equipo {
	String nombreEquipo;
	int[]puntuacion;
	Persona[]participantes;
	
	
	
	public Equipo(String nombreEquipo, int[] puntuacion, Persona[] participantes) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuacion = puntuacion;
		this.participantes = participantes;
	}



	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuacion=" + Arrays.toString(puntuacion)
				+ ", participantes=" + Arrays.toString(participantes) + "]";
	}

	
}
