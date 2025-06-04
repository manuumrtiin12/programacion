package RejistroDeVehiculos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class vehiculos {

	private int numeroBastidor;
	private int matricula;
	private String Marca;
	private String Modelo;
	private LocalDate anyoFabricacion;
	private int propietarioActual;
	
	List<Rematriculacion> rematri = new ArrayList<Rematriculacion>();
	
	public vehiculos(int numeroBastidor, int matricula, String marca, String modelo, LocalDate anyoFabricacion,
			int propietarioActual) {
		super();
		this.numeroBastidor = numeroBastidor;
		this.matricula = matricula;
		Marca = marca;
		Modelo = modelo;
		this.anyoFabricacion = anyoFabricacion;
		this.propietarioActual = propietarioActual;
	}

	public int getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(int numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public LocalDate getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(LocalDate anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public int getPropietarioActual() {
		return propietarioActual;
	}

	public void setPropietarioActual(int propietarioActual) {
		this.propietarioActual = propietarioActual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Marca, Modelo, anyoFabricacion, matricula, numeroBastidor, propietarioActual);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		vehiculos other = (vehiculos) obj;
		return Objects.equals(Marca, other.Marca) && Objects.equals(Modelo, other.Modelo)
				&& Objects.equals(anyoFabricacion, other.anyoFabricacion) && matricula == other.matricula
				&& numeroBastidor == other.numeroBastidor && propietarioActual == other.propietarioActual;
	}

	@Override
	public String toString() {
		return "vehiculos [numeroBastidor=" + numeroBastidor + ", matricula=" + matricula + ", Marca=" + Marca
				+ ", Modelo=" + Modelo + ", anyoFabricacion=" + anyoFabricacion + ", propietarioActual="
				+ propietarioActual + "]";
	}
	
	
	public String registrarRematriculacion(String nuevaMatricula, String fechaMatriculacion) {
		
		
	public String getRematriculaciones() {
		
	}

	public String getDatosVehiculo() {
		
	}
		
		
	}
	
}
