package RejistroDeVehiculos;

import java.time.LocalDate;

public class Rematriculacion {

	private String matriculaInicial;
	private String matriculaFinal;
	private LocalDate fechaMatriculacion;
	
	public Rematriculacion(String matriculaInicial, String matriculaFinal, LocalDate fechaMatriculacion) {
		super();
		this.matriculaInicial = matriculaInicial;
		this.matriculaFinal = matriculaFinal;
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getMatriculaInicial() {
		return matriculaInicial;
	}

	public void setMatriculaInicial(String matriculaInicial) {
		this.matriculaInicial = matriculaInicial;
	}

	public String getMatriculaFinal() {
		return matriculaFinal;
	}

	public void setMatriculaFinal(String matriculaFinal) {
		this.matriculaFinal = matriculaFinal;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	
	
}
