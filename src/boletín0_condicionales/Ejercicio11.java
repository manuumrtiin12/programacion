package boletín0_condicionales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un caracter(en mayusculas): ");
		String caracter = sc.nextLine();
		
		if (caracter.equals("A")) {
			System.out.println("Es la primera vocal (A)");}
		
		else if (caracter.equals("E")) {
			System.out.println("Es la segunda vocal (E)");}
		
		
}}
