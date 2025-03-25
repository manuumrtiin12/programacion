package Examen25_Marzo2_Modelo;

import java.util.Objects;

public class rutaBase implements IRuta {
	
	private int id;
	private String ciudadOrigen;
	private String ciudadDestino;
	private int distanciaKms;

	@Override
	public double getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipoRuta() {
		// TODO Auto-generated method stub
		return null;
	}

	public rutaBase(int id, String ciudadOrigen, String ciudadDestino, int distanciaKms) {
		super();
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distanciaKms = distanciaKms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public int getDistanciaKms() {
		return distanciaKms;
	}

	public void setDistanciaKms(int distanciaKms) {
		this.distanciaKms = distanciaKms;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudadDestino, ciudadOrigen, distanciaKms, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rutaBase other = (rutaBase) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "rutaBase [id=" + id + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino
				+ ", distanciaKms=" + distanciaKms + "]";
	}
	
	

}
