package PersonaRefactorizaModelo;

public class Persona {

	String nombre;
	IAccion [] acciones;
	
	public Persona() {
		super();
		this.acciones = new IAccion[10];
	}
	
	public void identificarse() {
		System.out.println("Soy una persona y me llamo" + nombre);
	}
}
