package Simulacro2OrientacionObjetoModelo;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deportista {

	private String Nombre;
	private String pais;
	private int edad;
	private double altura;
	private String Pruebas[];

	public Deportista(String nombre, String pais, int edad, double altura, String[] pruebas) {
		super();
		Nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.altura = altura;
		Pruebas = pruebas;
	}

	abstract double getTiempoCalentamiento();

	abstract int getCaloriasNecesariasDias();

	abstract int getHorasEntrenamiento();

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String[] getPruebas() {
		return Pruebas;
	}

	public void setPruebas(String[] pruebas) {
		Pruebas = pruebas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(Pruebas);
		result = prime * result + Objects.hash(Nombre, altura, edad, pais);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Objects.equals(Nombre, other.Nombre) && Arrays.equals(Pruebas, other.Pruebas)
				&& Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura) && edad == other.edad
				&& Objects.equals(pais, other.pais);
	}

	@Override
	public String toString() {
		return "Deportista [Nombre=" + Nombre + ", pais=" + pais + ", edad=" + edad + ", altura=" + altura
				+ ", Pruebas=" + Arrays.toString(Pruebas) + "]";
	}

}
