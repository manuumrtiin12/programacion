package EjemploInterfacesmodelo;

import java.util.Objects;

public abstract class SerVivo {

	private int Edad;
	
	abstract boolean estaVivo();
	abstract boolean seDesplaza();
	
	
	
	public SerVivo(int edad) {
		super();
		Edad = edad;
	}
	@Override
	public String toString() {
		return "SerVivo [Edad=" + Edad + "]";
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Edad);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SerVivo other = (SerVivo) obj;
		return Edad == other.Edad;
	}
	
	
}
