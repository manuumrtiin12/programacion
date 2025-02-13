package orientacion_objeto_3;

public class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, int punto) {
		super(nombre, nivel, punto, "Flecha");

	}

	public boolean esAtacado(Personaje p) {
		boolean atacado;
		if (p instanceof Mago) {
			atacado = true;
		}
		

		else {
			atacado = false;
		}
		return atacado;
	}

}
