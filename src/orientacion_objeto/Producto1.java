package orientacion_objeto;

import java.util.Scanner;

public class Producto1 {
	String nombre;
	int unidades;
	float precioVenta;

	String convierteCadena() {
		String cadena = "Nombre: " + nombre + " Unidades: " + unidades + "precio de venta: " + precioVenta;
		return cadena;
	}

	boolean PedirUnidades() {
		boolean pedir = true;
		if (unidades < 3) {
			pedir = true;
		}

		else {
			pedir = false;
		}

		return pedir;
	}
	
	int aumentaUnds(int unidadesRec) {
		int nuevasUnd = 0;
		if (unidades < 3) {
			System.out.println("Cuántas unidades quieres? ");
			nuevasUnd = unidades + unidadesRec;
	
		}
		return nuevasUnd;
	}

}