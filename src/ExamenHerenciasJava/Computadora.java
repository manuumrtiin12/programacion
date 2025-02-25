package ExamenHerenciasJava;

import java.util.Objects;

public class Computadora extends Dispositivo {

	private int capacidadRam;

	public Computadora(String marca, String modelo, double precio, int capacidadRam) {
		super(marca, modelo, precio);
		this.capacidadRam = capacidadRam;
	}

	protected int getCapacidadRam() {
		return capacidadRam;
	}

	protected void setCapacidadRam(int capacidadRam) {
		this.capacidadRam = capacidadRam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacidadRam);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computadora other = (Computadora) obj;
		return capacidadRam == other.capacidadRam;
	}

}
