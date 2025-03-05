package boletinAbstracto_tiendadeanimalesmodelo;

import java.time.LocalDate;

public class Aves extends Mascotas {

	private boolean Pico;
	private boolean Vuela;

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

	public boolean isPico() {
		return Pico;
	}

	public void setPico(boolean pico) {
		Pico = pico;
	}

	public boolean isVuela() {
		return Vuela;
	}

	public void setVuela(boolean vuela) {
		Vuela = vuela;
	}

	public Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		Pico = pico;
		Vuela = vuela;
	}

}
