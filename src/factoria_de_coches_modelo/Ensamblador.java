package factoria_de_coches_modelo;

public class Ensamblador extends RobotBase {

	@Override
	public String ejecutaTarea() {
		// TODO Auto-generated method stub
		return "Ensamblar piezas";
	}

	@Override
	public boolean recarga() {
		// TODO Auto-generated method stub
		
		boolean haRecargado = false;
		
		if (this.getEstado() == Estado.APAGADO) {
			System.out.println("Recargando por" + this.getCombustible());
			haRecargado = true;
		}
		return haRecargado;
	}

	public Ensamblador(String id, String modelo, int bateria, factoria_de_coches_modelo.Estado estado) {
		super(modelo, bateria, estado);
	}

	@Override
	public String toString() {
		return "Ensamblador [getId()=" + getId() + ", getModelo()=" + getModelo() + ", getBateria()=" + getBateria()
				+ ", getEstado()=" + getEstado() + "]";
	}

	
	
}
