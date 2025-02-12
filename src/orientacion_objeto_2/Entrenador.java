package orientacion_objeto_2;

public class Entrenador extends Persona {

	private String idFederacion;

	
	protected Entrenador(String nombre, String apellido, int edad, float salario, String email, String idFederacion) {
		super(nombre, apellido, edad, salario, email);
		this.idFederacion = idFederacion;
	}

	protected Entrenador(String nombre, String apellido, int edad, float salario, String email) {
		super(nombre, apellido, edad, salario, email);
		this.idFederacion = "ESP";
		
		
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]";
	}
	
	public void viajar() {
		System.out.println("Entrenador viaja");
	}
	
	public void Concentrarse() {
		System.out.println("Entrenador concentrandose");}
	
	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	};
	
	
}
