package boletín0_condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dame un numero para conocer si es multiplo de 2 o 3");
			int num = sc.nextInt();
	
			if (num % 2 == 0) {
				System.out.println("El numero es multiplo de 2");
				if (num % 6 == 0) {
					System.out.println("El numero es multiplo de 6");
				}
			} if (num % 3 == 0) {
				System.out.println("El numero es multiplo de 3");
		}}}}
