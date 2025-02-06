package orientacion_objeto;

public class GestionaAlumno {

	public static void main(String[] args) {
		Alumno Matias = new Alumno();
		Matias.Nombre = "Matias";
		Matias.DNI = "77849189L";
		Matias.Nota = 8;
		
		
		Alumno Pepe = new Alumno();
		Pepe.Nombre = "Pepe";
		Pepe.DNI = "23438418O";
		Pepe.Nota = 4;
		
		String cadenaMatias = Matias.convierteCadena();
		System.out.println(cadenaMatias);
		String cadenaPepe = Pepe.convierteCadena();
		System.out.println(cadenaPepe);
		
		boolean apruebaMatias = Matias.aprobado();
		System.out.println(apruebaMatias);
		
		Pepe.Nota = 4;
		
		boolean apruebaPepe = Pepe.aprobado();
		System.out.println(apruebaPepe);
	}

}
