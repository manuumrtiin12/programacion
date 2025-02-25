package ExamenHerenciasJava;

import java.util.Objects;

public class Laptop extends Computadora {
	
	private double peso;

	public Laptop(String marca, String modelo, double precio, int capacidadRam, double peso) {
		super(marca, modelo, precio, capacidadRam);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(peso);
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
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
	
	int calculaPrecioDescuento() {
		if (peso < 2) {
			int precioDescuento = (int) (100/(precio*12));
		}else if (peso > 2) {
			int precioDescuento = (int) (100/(precio*20));

		}
		return precioDescuento;
	}
}
