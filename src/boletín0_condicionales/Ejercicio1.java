package boletín0_condicionales;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dame un numero: ");
			int num = sc.nextInt();
			
			if (num < 12) {
				System.out.println("Valor ¡CORRECTO!");
					
			}
		}
		
	}
	
}

