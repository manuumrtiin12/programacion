package orientacion_objeto;

public class Persona {
	String nombre;
	String apellido;
	String DNI;
	
	public Persona(String nombre, String apellido, String dNI) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	
	
}
