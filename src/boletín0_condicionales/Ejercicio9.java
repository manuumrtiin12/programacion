package boletín0_condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		
		if (edad <= 12) {
			System.out.println(edad + " " + "es la edad de un niño");}
		
		else if (edad >= 13) {
			System.out.println(edad + " " + "es la edad de un adolescente");}
			
		else if (edad >= 18) {
			System.out.println(edad + " " + "es la edad de un joven");
		
		if (edad > 29) {
			System.out.println(edad + " " + "es la edad de un adulto");}
		}
		}
		}
		


