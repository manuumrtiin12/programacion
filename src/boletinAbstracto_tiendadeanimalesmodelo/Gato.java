package boletinAbstracto_tiendadeanimalesmodelo;

import java.time.LocalDate;

public class Gato extends Mascotas {

	private String Color;
	private boolean PeloLargo;

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public boolean isPeloLargo() {
		return PeloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		PeloLargo = peloLargo;
	}

	public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		Color = color;
		PeloLargo = peloLargo;
	}

}
