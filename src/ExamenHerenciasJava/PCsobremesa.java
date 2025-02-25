package ExamenHerenciasJava;

import java.util.Objects;

public class PCsobremesa extends Computadora {
	
	private boolean tieneGPUdedicada;

	public PCsobremesa(String marca, String modelo, double precio, int capacidadRam, boolean tieneGPUdedicada) {
		super(marca, modelo, precio, capacidadRam);
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	protected boolean isTieneGPUdedicada() {
		return tieneGPUdedicada;
	}

	protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tieneGPUdedicada);
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
		PCsobremesa other = (PCsobremesa) obj;
		return tieneGPUdedicada == other.tieneGPUdedicada;
	}
	
	
}
