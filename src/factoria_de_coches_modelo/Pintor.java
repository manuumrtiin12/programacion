package factoria_de_coches_modelo;

public class Pintor extends RobotBase {

	@Override
	public String EjecutaTarea() {
		// TODO Auto-generated method stub
		if (this.getEstado() == Estado.ENCENDIDO) {
			System.out.println("La tarea es alicar pintura a los vehiculos");
		} else {
			System.out.println("El robot no puede funcionar en este estado");
		}
		return EjecutaTarea();
	}

	@Override
	public boolean Recarga() {
		// TODO Auto-generated method stub
		System.out.println("Recargando por electricidad");
		return Recarga();
	}

	public Pintor(String id, String modelo, int bateria, factoria_de_coches_modelo.Estado estado) {
		super(id, modelo, bateria, estado);
	}

	@Override
	public String toString() {
		return "Pintor [getId()=" + getId() + ", getModelo()=" + getModelo() + ", getBateria()=" + getBateria()
				+ ", getEstado()=" + getEstado() + "]";
	}

	
	
	
	}
	
	

