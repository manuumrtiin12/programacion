package orientacion_objeto_3;

import java.security.PrivateKey;
import java.util.Objects;

public class PersonaEj {

	private static int contador;
	private String nombre;
	private int edad;
	private int identificador; 
	
	
	
	public PersonaEj(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificador = contador+1;
		contador = contador+1;
	}
	protected int getContador() {
		return contador;
	}
	protected void setContador(int contador) {
		this.contador = contador;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected int getIdentificador() {
		return identificador;
	}
	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contador, edad, identificador, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaEj other = (PersonaEj) obj;
		return contador == other.contador && edad == other.edad && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "PersonaEj [contador=" + contador + ", nombre=" + nombre + ", edad=" + edad + ", identificador="
				+ identificador + "]";
	}
	
	
	static boolean validaSiDniValido(String dni) {
		boolean valido = false;
		if (dni.matches("\\d{8}[A-Za-z]{1}")) {
			valido = true;
		} else {
			System.out.println("Error, dni no válido");
			valido = false;
		}
		return valido;
	}
	
	
}
