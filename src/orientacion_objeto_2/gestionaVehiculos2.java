package orientacion_objeto_2;

public class gestionaVehiculos2 {

	public static void main(String[] args) {
		Automovil2 c1 = new Automovil2 ("Pepe", 5, 5, "A"); 
		Vehiculo2 c2 = new Automovil2 ("Pepa", 3, 4, "Eco");
		
		boolean esVehiculo = c2 instanceof Automovil2; System.out.println("Es Vehiculo?"+esVehiculo);
		boolean esCoche = c2 instanceof Automovil2; System.out.println("Es Coche?"+esCoche);
	}

}
