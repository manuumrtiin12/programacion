package Simulacro;

import java.util.Objects;

public class Empleados {
	String nombre;
	String dni;
	int salarioBase;

	public Empleados(String nombre, String dni, int salarioBase) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	void validarSalarioBase(int salarioBase) {
		int salarioMinimo;
		if (salarioBase <0) {
			System.out.println("Valor introducido incorrecto");
			salarioMinimo = 1134;
		}
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", dni=" + dni + ", salarioBase=" + salarioBase + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object empleado) {
		if (this == empleado)
			return true;
		if (empleado == null)
			return false;
		if (getClass() != empleado.getClass())
			return false;
		Empleados other = (Empleados) empleado;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

}
