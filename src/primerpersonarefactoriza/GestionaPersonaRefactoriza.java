package primerpersonarefactoriza;

public class GestionaPersonaRefactoriza {
	
	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Marcelo");
		e1.trabajar();
		Cliente c1 = new Cliente("Manolo");
		c1.comprar();
		Estudiante es1 = new Estudiante("Pepe");
		es1.estudiar();
		EstudianteEmpleado estEmpl1 = new EstudianteEmpleado("Adrian");
		estEmpl1.trabajar();
		Artista a1 = new Artista("Jose Carlos");
		a1.pintar();
		
		
	}

}
