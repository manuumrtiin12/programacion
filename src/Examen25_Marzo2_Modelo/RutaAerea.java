package Examen25_Marzo2_Modelo;

public class RutaAerea extends rutaBase {
	
	private TipoVuelo tipoVuelo;

	public RutaAerea(int id, String ciudadOrigen, String ciudadDestino, int distanciaKms) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RutaAerea(int id, String ciudadOrigen, String ciudadDestino, int distanciaKms, TipoVuelo tipoVuelo,
			double precioVuelo) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		this.tipoVuelo = tipoVuelo;
		this.precioVuelo = precioVuelo;
	}
	
	
	double precioVuelo;
	
	@Override
	public double getCoste() {
		if (tipoVuelo.equals(tipoVuelo.LOW_COST)) {
			precioVuelo = getDistanciaKms() * 0.75;
			return precioVuelo;
			
		}else if (tipoVuelo.equals(tipoVuelo.NORMAL)) {
			precioVuelo = getDistanciaKms() * 1.1;
			return precioVuelo;
		}else {
			precioVuelo = getDistanciaKms() * 1.5;
			return precioVuelo;

		}
		
	}
	
	@Override
	public String getTipoRuta() {
		return "RutaAerea" + tipoVuelo;
	}

}
