package cadenaAlimenticia_modelo;

import java.util.Objects;

public abstract class Animal {
	
	private String nombreEspecie;
	private String tipoFamilia; 
	private String habitat;
	private String AnimalesQueCome;
	
	abstract boolean atacar(Animal a);
	abstract boolean huir();
	
	public Animal(String nombreEspecie, String tipoFamilia, String habitat, String animalesQueCome) {
		super();
		this.nombreEspecie = nombreEspecie;
		this.tipoFamilia = tipoFamilia;
		this.habitat = habitat;
		AnimalesQueCome = animalesQueCome;
	}
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	public String getTipoFamilia() {
		return tipoFamilia;
	}
	public void setTipoFamilia(String tipoFamilia) {
		this.tipoFamilia = tipoFamilia;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getAnimalesQueCome() {
		return AnimalesQueCome;
	}
	public void setAnimalesQueCome(String animalesQueCome) {
		AnimalesQueCome = animalesQueCome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(AnimalesQueCome, habitat, nombreEspecie, tipoFamilia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(AnimalesQueCome, other.AnimalesQueCome) && Objects.equals(habitat, other.habitat)
				&& Objects.equals(nombreEspecie, other.nombreEspecie) && Objects.equals(tipoFamilia, other.tipoFamilia);
	}
	
	
	
	

}
