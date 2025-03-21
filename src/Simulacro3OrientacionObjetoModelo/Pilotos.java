package Simulacro3OrientacionObjetoModelo;

import java.util.Objects;

public class Pilotos {

	private String nombre;
	private String nacionalidad;
	private int edad;
	private int numLicencia;
	private int totalHoras;
	private Vuelo [] vuelosAsignados;

	
	

	public Pilotos(String nombre, String nacionalidad, int edad, int numLicencia, int totalHoras,
			Vuelo[] vuelosAsignados) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numLicencia = numLicencia;
		this.totalHoras = totalHoras;
		this.vuelosAsignados = vuelosAsignados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public Vuelo[] getVuelosAsignados() {
		return vuelosAsignados;
	}

	public void setVuelosAsignados(Vuelo[] vuelosAsignados) {
		this.vuelosAsignados = vuelosAsignados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nacionalidad, nombre, numLicencia, totalHoras, vuelosAsignados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilotos other = (Pilotos) obj;
		return numLicencia == other.numLicencia;

	}

	@Override
	public String toString() {
		return "Pilotos [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", numLicencia="
				+ numLicencia + ", totalHoras=" + totalHoras + ", vuelosAsignados=" + vuelosAsignados + "]";
	}

}
