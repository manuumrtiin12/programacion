package orientacion_objeto_2;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private float salario;
	private String email;

	public void viajar() {
		System.out.println("Persona viaja");
	}

	public void Concentrarse() {
		System.out.println("Persona concentrandose");
	}

	public void Concentrarse(String lugar) {
		System.out.println("metodo concentrarse del padre con String" + " " + lugar);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, email, nombre, salario);
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
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", email=" + email + "]";
	}

	public Persona(String nombre, String apellido, int edad, float salario, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.email = email;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

}
