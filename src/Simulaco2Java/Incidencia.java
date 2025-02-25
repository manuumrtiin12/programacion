package Simulaco2Java;

import java.time.LocalDate;
import java.util.Objects;

public class Incidencia {

	private int identificador;
	private String nombre;
	private String descripcion;
	private LocalDate fechaRegistro;
	private LocalDate fechaCierre;
	private Equipo equipo;
	private Estado estado;
	private Criticidad criticidad;

	public Incidencia(int identificador, String nombre, String descripcion, LocalDate fechaRegistro,
			LocalDate fechaCierre, Equipo equipo, Estado estado, Criticidad criticidad) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaRegistro = fechaRegistro;
		this.fechaCierre = fechaCierre;
		this.equipo = equipo;
		this.estado = estado;
		this.criticidad = criticidad;
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	protected void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	protected LocalDate getFechaCierre(){
		if (estado.equals(Estado.CERRADA))
			estado.equals(null);
		return fechaCierre;
	}

	protected void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	protected Equipo getEquipo() {
		return equipo;
	}

	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

	protected Criticidad getCriticidad() {
		return criticidad;
	}

	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaCierre, fechaRegistro, identificador, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidencia other = (Incidencia) obj;
		return Objects.equals(criticidad, other.criticidad) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && Objects.equals(estado, other.estado)
				&& Objects.equals(fechaCierre, other.fechaCierre) && Objects.equals(fechaRegistro, other.fechaRegistro)
				&& identificador == other.identificador && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Incidencia [nombre=" + nombre + ", fechaRegistro=" + fechaRegistro + ", estado="
				+ estado + ", criticidad=" + criticidad +  ", equipo=" + equipo + "]";
	}

	
	/*public boolean esUrgente() {
		if (getCriticidad().equals(Criticidad.criticidad.CRITICA));*/
			
	}
	
	


