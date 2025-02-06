package boletín0_condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el primer numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Dame el segundo numero: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Dame el tercer numero: ");
		int numero3 = sc.nextInt();
		
		System.out.println("Dame el cuarto numero: ");
		int numero4 = sc.nextInt();
		
		int resultado = (numero1 + numero2 + numero3 + numero4) / 4;
		
		System.out.println("La media de estos numeros es:" + " " + resultado);
	}

}
 