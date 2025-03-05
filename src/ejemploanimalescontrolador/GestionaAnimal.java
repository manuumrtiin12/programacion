package ejemploanimalescontrolador;

import ejemploanimalmodelo.*;

public class GestionaAnimal {

	public static void main(String[] args) {
		
		Animal perro1 = new Perro();
		Animal gato1 = new Gato();
		Animal pez1 = new Pez();
		
		
		/*Animal a = new Animal();*/
		/*No se puede crear un objeto de una clase abstracta*/
		
		System.out.println(perro1.getAlimento());
		System.out.println(perro1.getSonidoQueEmite());
		
		System.out.println(gato1.getAlimento());
		System.out.println(gato1.getSonidoQueEmite());
		
		System.out.println(pez1.getAlimento());
		System.out.println(pez1.getSonidoQueEmite());
	}
}
