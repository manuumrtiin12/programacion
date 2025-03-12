package primerpersonarefactoriza;

public class PersonaRefactoriza {
    String nombre;


    public void identificarse() {
        System.out.println("Soy una persona y me llamo " + nombre);
    }


	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
	}
}


class Empleado extends PersonaRefactoriza {
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

	public Empleado(String nombre) {
		super(nombre);
	}
    
    
}


class Cliente extends PersonaRefactoriza {
    public void comprar() {
        System.out.println(nombre + " está comprando.");
    }

	public Cliente(String nombre) {
		super(nombre);
	}
    
    
}


// Agregamos más clases para hacer evidente el problema


class Estudiante extends PersonaRefactoriza {
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

	public Estudiante(String nombre) {
		super(nombre);
	}
    
    
}


// Un problema surge aquí: ¿qué pasa si un Estudiante también es Empleado?
class EstudianteEmpleado extends Estudiante {
    public void trabajar() {
        System.out.println(nombre + " está estudiando y trabajando.");
    }

	public EstudianteEmpleado(String nombre) {
		super(nombre);
	}
    
    
}


// Agregamos otra clase con otro comportamiento
class Artista extends PersonaRefactoriza {
    public void pintar() {
        System.out.println(nombre + " está pintando.");
    }

	public Artista(String nombre) {
		super(nombre);
	}

    
    
}
