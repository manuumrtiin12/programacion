package EjemploEnClase;

import java.util.Objects;

public class Persona implements Comparable<Persona>{

	private String Nombre;
	
	

	public Persona(String nombre) {
		super();
		Nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Nombre, other.Nombre);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	

	}

