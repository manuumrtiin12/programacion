package boletinAbstracto_tiendadeanimalesmodelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {

	private String Nombre;
	private int Edad;
	private String Estado;
	private LocalDate FechaNacimiento;

	public abstract String muestra();

	public abstract boolean habla();

	public LocalDate cumpleaños() {
		return FechaNacimiento;
	}

	public boolean muerto() {
		return true;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
		super();
		Nombre = nombre;
		Edad = edad;
		Estado = estado;
		FechaNacimiento = fechaNacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Edad, Estado, FechaNacimiento, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascotas other = (Mascotas) obj;
		return Edad == other.Edad && Objects.equals(Estado, other.Estado)
				&& Objects.equals(FechaNacimiento, other.FechaNacimiento) && Objects.equals(Nombre, other.Nombre);
	}

}
