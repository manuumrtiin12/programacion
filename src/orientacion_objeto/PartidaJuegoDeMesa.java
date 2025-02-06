package orientacion_objeto;

public class PartidaJuegoDeMesa {

	String NombreJuego;
	ParticipanteJuegoDeMesa[]participantes;
	ParticipanteJuegoDeMesa ganador;
	
	public PartidaJuegoDeMesa(String nombreJuego, ParticipanteJuegoDeMesa[] participantes,
			ParticipanteJuegoDeMesa ganador) {
		super();
		NombreJuego = nombreJuego;
		this.participantes = participantes;
		this.ganador = ganador;
	}
	
	
}
