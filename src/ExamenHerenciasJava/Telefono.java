package ExamenHerenciasJava;

import java.util.Objects;

public class Telefono extends Dispositivo {

	private boolean tieneTecladoFisico;


	public Telefono(String marca, String modelo, double precio, boolean tieneTecladoFisico) {
		super(marca, modelo, precio);
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	protected boolean getTieneTecladoFisico() {
		return tieneTecladoFisico;
	}

	protected void setTieneTecladoFisico(boolean tieneTecladoFisico) {
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tieneTecladoFisico);
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
		Telefono other = (Telefono) obj;
		return tieneTecladoFisico == other.tieneTecladoFisico;
	}
	
	
}
