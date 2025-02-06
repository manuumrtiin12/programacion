package paquete2;

public class animal {
	public String tipo;
	public String nombre;
	private int edad;

	public boolean caminar() {

		return true;
	}

	public void darDeComer() {
		if (tipo.equals("perro")) {
			comer();
		}
	}
	 public boolean sonDelMismoTipo(animal a1, int numero) {
		boolean son = false;
		son = tipo.equals(a1.tipo);
		return son;
	}
	
	
	private void comer() {

		System.out.println("Estoy comiendo");
	}
}
