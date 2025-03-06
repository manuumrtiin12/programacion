package EjemploInterfacesmodelo;

public class Animal extends SerVivo {

	public Animal(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;}
	
		
	boolean come() {
		return true;}	
		
		
	boolean respira() {
		return true;
	}

	@Override
	public String toString() {
		return "Animal [estaVivo()=" + estaVivo() + ", seDesplaza()=" + seDesplaza() + ", toString()="
				+ super.toString() + ", getEdad()=" + getEdad() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + "]";
	}

	
	
	}


