package ExamenHerenciasJava;

import java.util.Objects;

public class Dispositivo {

	private String marca;
	private String modelo;
	protected double precio;
	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected double getPrecio() {
		return precio;
	}
	protected void setPrecio(double precio) {
		if(this.precio >= 0) {
			this.precio = precio;
		}else {
			this.precio = 1;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	
	int precioDescuento = (int) (100/(precio*10));
	
	@Override
	public String toString() {
		return "Dispositivo [marca:" + marca + "- modelo:" + modelo + "- precio:" + precio + "- Precio con descuento:" + precioDescuento + "]";
	}
}
