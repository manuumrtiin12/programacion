package Examen25_Marzo_Modelo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public abstract class MiembroBase {

	private int id;
	private String email;
	private String nombre;
	private int contadorAmigos;
	private static int contadorIdentificador;
	protected String amigos[];

	public MiembroBase(int id, String email, String nombre, int contadorAmigos, int contadoIdentificador) {
		super();
		this.id = id;
		this.email = email;
		this.nombre = nombre;
		this.contadorAmigos = contadorAmigos + 1;
		MiembroBase.contadorIdentificador = contadorIdentificador + 1;
		this.amigos = amigos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContadorAmigos() {
		return contadorAmigos;
	}

	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	public static int getContadorIdentificador() {
		return contadorIdentificador;
	}

	public static void setContadorIdentificador(int contadorIdentificador) {
		MiembroBase.contadorIdentificador = contadorIdentificador;
	}

	public String[] getAmigos() {
		return amigos;
	}

	public void setAmigos(String[] amigos) {
		this.amigos = amigos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nombre, contadorAmigos, contadorIdentificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	
	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + ", contadorAmigos="
				+ contadorAmigos + ", amigos=" + Arrays.toString(amigos) + "]";
	}

	/*public String addMiembro() {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Que miembro quieres añadir");
		String miembroNuevo = sc.nextLine();
				
	}*/
		
	public abstract String getTipoUsuario();

}
