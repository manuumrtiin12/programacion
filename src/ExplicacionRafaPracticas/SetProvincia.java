package ExplicacionRafaPracticas;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetProvincia {

	public static void main(String[] args) {
		
		Provincia cadiz = new Provincia("Cadiz", 20000);
		Provincia sevilla = new Provincia("Sevilla", 20077);
		Provincia sevilla1 = new Provincia("Sevilla", 20077);

		
		Set <Provincia> provin = new HashSet <Provincia>();
		
		System.out.println(provin.add(sevilla));
		System.out.println(provin.add(cadiz));
		System.out.println(provin.add(sevilla1));

		for (Provincia cadena: provin)
		{
			System.out.println(cadena);
		}
		
		//Collections.sort(provin);
	}
}




