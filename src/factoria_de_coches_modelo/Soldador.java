package factoria_de_coches_modelo;

import java.util.Objects;

public class Soldador extends RobotBase {

	private int TemperaturaTrabajo;
	private String EspecifSeguridad;

	@Override
	public String ejecutaTarea() {
		// TODO Auto-generated method stub
		if (this.getEstado() == Estado.ENCENDIDO) {
			System.out.println("La tarea es realizar soldaduras precisas a la carroceria");
		} else {
			System.out.println("El robot no puede funcionar en este estado");
		}
		return ejecutaTarea();
	}

	@Override
	public boolean recarga() {
		// TODO Auto-generated method stub
		if (getEstado() == Estado.APAGADO) {
			System.out.println("Recargando por electricidad");
			return true;
		}else {
			System.out.println("Estoy encendido y no puedo recargar");
			return false;
		}
		
	}

	public Soldador(String modelo, int bateria, factoria_de_coches_modelo.Estado estado,
			int temperaturaTrabajo, String especifSeguridad) {
		super(modelo, bateria, estado);
		TemperaturaTrabajo = temperaturaTrabajo;
		EspecifSeguridad = especifSeguridad;
	}

	public int getTemperaturaTrabajo() {
		return TemperaturaTrabajo;
	}

	public void setTemperaturaTrabajo(int temperaturaTrabajo) {
		TemperaturaTrabajo = temperaturaTrabajo;
	}

	public String getEspecifSeguridad() {
		return EspecifSeguridad;
	}

	public void setEspecifSeguridad(String especifSeguridad) {
		EspecifSeguridad = especifSeguridad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(EspecifSeguridad, TemperaturaTrabajo);
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
		Soldador other = (Soldador) obj;
		return Objects.equals(EspecifSeguridad, other.EspecifSeguridad)
				&& TemperaturaTrabajo == other.TemperaturaTrabajo;
	}

	@Override
	public String toString() {
		return "Soldador [TemperaturaTrabajo=" + TemperaturaTrabajo + ", EspecifSeguridad=" + EspecifSeguridad + "]";
	}

}
