package Examen25_Marzo_Modelo;

public class GuzmanitosException extends Exception {

	public GuzmanitosException(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "GuzmanitosException []";
	}
	
	
}
