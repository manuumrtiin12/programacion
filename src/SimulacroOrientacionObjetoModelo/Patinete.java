package SimulacroOrientacionObjetoModelo;

public class Patinete extends Vgeneral {

	private int id;
	private String autonomia;
	private String marca;
	private String modelo;
	private int fianza;
	private boolean abonado;
	
	@Override
	double getImporteGenerado() {
		return 0;
		
	}
	
	boolean abonadoSioNO() {
		if (abonado == true) {
			System.out.println("El patinete a sido abonado");
			
		}else {
			System.out.println("El patinete no a sido abonado");
		}
		return abonado;
		
	}

}
