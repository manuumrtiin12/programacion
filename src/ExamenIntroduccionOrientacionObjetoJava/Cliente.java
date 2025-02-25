package ExamenIntroduccionOrientacionObjetoJava;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
	private String DNI; 
	private String Nombre;
	private String Apellios;
	private int Edad; 
	private TipoDieta DietaAsignada;
	private LocalDate FechaInscripcion;
	private boolean esVip;
	public Cliente(String dNI, String nombre, String apellios, int edad, TipoDieta dietaAsignada,
			LocalDate fechaInscripcion, boolean esVip) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellios = apellios;
		Edad = edad;
		DietaAsignada = dietaAsignada;
		FechaInscripcion = fechaInscripcion;
		this.esVip = esVip;
	}
	protected String getDNI() {
		return DNI;
	}
	protected void setDNI(String dNI) {
		DNI = dNI;
	}
	protected String getNombre() {
		return Nombre;
	}
	protected void setNombre(String nombre) {
		Nombre = nombre;
	}
	protected String getApellios() {
		return Apellios;
	}
	protected void setApellios(String apellios) {
		Apellios = apellios;
	}
	protected int getEdad() {
		return Edad;
	}
	protected void setEdad(int edad) {
		Edad = edad;
	}
	protected TipoDieta getDietaAsignada() {
		return DietaAsignada;
	}
	protected void setDietaAsignada(TipoDieta dietaAsignada) {
		DietaAsignada = dietaAsignada;
	}
	protected LocalDate getFechaInscripcion() {
		return FechaInscripcion;
	}
	protected void setFechaInscripcion(LocalDate fechaInscripcion) {
		FechaInscripcion = fechaInscripcion;
	}
	protected boolean isEsVip() {
		return esVip;
	}
	protected void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Apellios, DNI, DietaAsignada, Edad, FechaInscripcion, Nombre, esVip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(Apellios, other.Apellios) && Objects.equals(DNI, other.DNI)
				&& DietaAsignada == other.DietaAsignada && Edad == other.Edad
				&& Objects.equals(FechaInscripcion, other.FechaInscripcion) && Objects.equals(Nombre, other.Nombre)
				&& esVip == other.esVip;
	}
	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellios=" + Apellios + ", Edad=" + Edad
				+ ", DietaAsignada=" + DietaAsignada + ", FechaInscripcion=" + FechaInscripcion + ", esVip=" + esVip
				+ "]";
	}

	private String hayQueHacerPromocion; {
		if (esVip = true) {
			System.out.println("El cliente es vip");
		if (Edad >= 65) {
			System.out.println("Es mayor de 65 años");
		}
		}
	}
	
}
