package boletín0_condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			System.out.println("Introduce un numero: ");
			int numero1 = sc.nextInt();
			
			System.out.println("Dame otro numero: ");
			int numero2 = sc.nextInt();
			
		if (numero1 == numero2)
			System.out.println("Ambos numeros son el mismo");
			
		else if (numero1 > numero2)
			System.out.println("El numero 1 es mayor que el numero 2");
		
		else if (numero2 > numero1)
			System.out.println("El numero 2 es mayor que el numero 1");
	}

}




