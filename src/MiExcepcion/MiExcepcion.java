package MiExcepcion;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiExcepcion(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "MiExcepcion []";
	}

	
}
