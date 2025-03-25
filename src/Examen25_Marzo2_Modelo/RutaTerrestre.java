package Examen25_Marzo2_Modelo;

public class RutaTerrestre extends rutaBase {
	
	private boolean siEsCarretera;
	private double costeCienKms = 0.65;

	public RutaTerrestre(int id, String ciudadOrigen, String ciudadDestino, int distanciaKms) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		// TODO Auto-generated constructor stub
	}

	double precioDistancia = 0;

	
	@Override
	public double getCoste() {
		precioDistancia = getDistanciaKms() * costeCienKms;
		return precioDistancia;
	}

	@Override
	public String getTipoRuta() {
		if(siEsCarretera = true) {
			return "Ruta Terrestre: Carretera";
		} else {
			return "Ruta Terrestre: Tren";
		}
	}
}
