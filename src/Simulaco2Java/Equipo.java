package Simulaco2Java;

import java.util.Objects;

public class Equipo {

	private String nombre;
	private String mac;
	private String sistemaOperativo;
	private int numeroIncidencias;

	public Equipo(String nombre, String mac, String sistemaOperativo) {
		super();
		nombre = nombre;
		mac = mac;
		sistemaOperativo = sistemaOperativo;

	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		nombre = nombre;
	}

	protected String getMac() {
		return mac;
	}

	protected void setMac(String mac) {
		mac = mac;
	}

	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		sistemaOperativo = sistemaOperativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mac, nombre, sistemaOperativo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(mac, other.mac);
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ": mac=" + mac + ": numeroIncidencias=" + numeroIncidencias + "]";
	}

	

}
