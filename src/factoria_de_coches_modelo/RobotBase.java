package factoria_de_coches_modelo;

import java.util.Objects;

public abstract class RobotBase {
	private int id;
	private String Modelo;
	private int Bateria;
	private Estado Estado;
	private static int contador; 

	
	public abstract String ejecutaTarea();
	public abstract boolean recarga();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getBateria() {
		return Bateria;
	}
	public void setBateria(int bateria) {
		Bateria = bateria;
	}
	public Estado getEstado() {
		return Estado;
	}
	public void setEstado(Estado estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "RobotBase [id=" + id + ", Modelo=" + Modelo + ", Bateria=" + Bateria + ", Estado=" + Estado + "]";
	}
	public RobotBase(String modelo, int bateria, factoria_de_coches_modelo.Estado estado ) {
		super();
		this.id = contador+1;
		Modelo = modelo;
		Bateria = bateria;
		Estado = estado;
		contador = contador+1;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Bateria, Estado, Modelo, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotBase other = (RobotBase) obj;
		return id == other.id;
	}
	
	private boolean NivelBateria() {
		if (Bateria > 10) {
			 boolean BateriaUsable = true;
		}else {
			boolean BateriaUsable = false;
		}
		return NivelBateria();
	}
	
	
}
