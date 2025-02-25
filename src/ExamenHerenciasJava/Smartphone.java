package ExamenHerenciasJava;

import java.util.Objects;

public class Smartphone extends Telefono {
	
	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico) {
		super(marca, modelo, precio, tieneTecladoFisico);
	}

	private int cantidadCamaras;

	
	

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantidadCamaras);
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
		Smartphone other = (Smartphone) obj;
		return cantidadCamaras == other.cantidadCamaras;
	}
	
	int calculaPrecioDescuento() {
		int precioDescuento = (int) (100/(precio*15));
		return precioDescuento;

}}
