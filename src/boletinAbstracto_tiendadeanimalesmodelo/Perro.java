package boletinAbstracto_tiendadeanimalesmodelo;

import java.time.LocalDate;

public class Perro extends Mascotas {

	private String Raza;
	private int Pulgas;

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

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public int getPulgas() {
		return Pulgas;
	}

	public void setPulgas(int pulgas) {
		Pulgas = pulgas;
	}

	public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, int pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		Raza = raza;
		Pulgas = pulgas;
	}

}
