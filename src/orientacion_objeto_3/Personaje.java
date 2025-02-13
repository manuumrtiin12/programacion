package orientacion_objeto_3;

import java.util.Objects;

public class Personaje {
	private static final boolean True = false;
	private String nombre;
	private int nivel;
	private int punto;
	private String arma;
	
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getNivel() {
		return nivel;
	}
	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}
	protected int getPunto() {
		return punto;
	}
	protected void setPunto(int punto) {
		this.punto = punto;
	}
	protected String getArma() {
		return arma;
	}
	protected void setArma(String arma) {
		this.arma = arma;
	}
	@Override
	public int hashCode() {
		return Objects.hash(arma, nivel, nombre, punto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(arma, other.arma) && nivel == other.nivel && Objects.equals(nombre, other.nombre)
				&& punto == other.punto;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", punto=" + punto + ", arma=" + arma
				+ ", getNombre()=" + getNombre() + ", getNivel()=" + getNivel() + ", getPunto()=" + getPunto()
				+ ", getArma()=" + getArma() + ", hashCode()=" + hashCode() + "]";
	}
	protected Personaje(String nombre, int nivel, int punto, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.punto = punto;
		this.arma = arma;
	}
	
	
	
	public boolean esAtacado(Personaje p) {
		return true;
	}
}
