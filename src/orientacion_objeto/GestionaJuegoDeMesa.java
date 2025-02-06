package orientacion_objeto;

public class GestionaJuegoDeMesa {
	public static void main(String[] args) {

		ParticipanteJuegoDeMesa p1 = new ParticipanteJuegoDeMesa("PepePalotero", "Pepe", 37, 20);
		ParticipanteJuegoDeMesa p2 = new ParticipanteJuegoDeMesa("SuCani34", "Borja", 20, 17);
		ParticipanteJuegoDeMesa p3 = new ParticipanteJuegoDeMesa("LaMaeb", "Maria", 18, 21);
		ParticipanteJuegoDeMesa p4 = new ParticipanteJuegoDeMesa("ElManteca", "Rogelio", 25, 12);

		ParticipanteJuegoDeMesa[] participantes = { p1, p2, p3, p4 };

		PartidaJuegoDeMesa part1 = new PartidaJuegoDeMesa("Catan", participantes, null);
		
		
	}
}
