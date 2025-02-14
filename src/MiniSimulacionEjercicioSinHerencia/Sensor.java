package MiniSimulacionEjercicioSinHerencia;

import java.util.Objects;

public class Sensor {
	private double distancia;
	private double velocidad;

	protected double getDistancia() {
		return distancia;
	}

	protected void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	protected double getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distancia, velocidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		return Double.doubleToLongBits(distancia) == Double.doubleToLongBits(other.distancia)
				&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
	}

	public Sensor(double distancia, double velocidad) {
		super();
		this.distancia = distancia;
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Sensor [distancia=" + distancia + ", velocidad=" + velocidad + "]";
	}

}
