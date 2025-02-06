package orientacion_objeto;


public class GestionaGato {

	public static void main(String[] args) {
		Gato macho = new Gato(null, null, 0, 0);
		macho.color = "Naranja";
		macho.raza = "Siames";
		macho.sexo = "M";
		macho.edad = 1;
		macho.peso = 4;

		Gato Hembra1 = new Gato(null, null, 0, 0);
		Hembra1.color = "Gris";
		Hembra1.raza = "Siames";
		Hembra1.sexo = "H";
		Hembra1.edad = 2;
		Hembra1.peso = 3;

		Gato Hembra2 = new Gato(null, null, 0, 0);
		Hembra1.color = "Atigrada";
		Hembra1.raza = "Siames";
		Hembra1.sexo = "H";
		Hembra1.edad = 1;
		Hembra1.peso = 5;

		macho.maulla();
		macho.QueComida("pienso");
		
		Hembra1.ronronea();
		Hembra1.QueComida("pescado");
		
		Hembra1.pelea(Hembra2);
		macho.pelea(Hembra1);
		}
		
	}

