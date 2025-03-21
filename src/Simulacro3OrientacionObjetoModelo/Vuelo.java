package Simulacro3OrientacionObjetoModelo;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {

	private int identficador;
	private String aerolinea;
	private String destino;
	private LocalDate fechaVuelo;
	private int duracion;
	private EstadoVuelo estado;

	public Vuelo(int identficador, String aerolinea, String destino, LocalDate fechaVuelo, int duracion,
			EstadoVuelo estado) {
		super();
		this.identficador = identficador;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechaVuelo = fechaVuelo;
		this.duracion = duracion;
		this.estado = estado;
	}

	public int getIdentficador() {
		return identficador;
	}

	public void setIdentficador(int identficador) {
		this.identficador = identficador;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public EstadoVuelo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVuelo estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aerolinea, destino, duracion, estado, fechaVuelo, identficador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return identficador == other.identficador;
	}

	@Override
	public String toString() {
		return "Vuelo [identficador=" + identficador + ", aerolinea=" + aerolinea + ", destino=" + destino
				+ ", fechaVuelo=" + fechaVuelo + ", duracion=" + duracion + ", estado=" + estado + "]";
	}

	int VuelosAsignadosMax() {
		if (this.vuelosAsignados);
		
	}
}
