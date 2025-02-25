package orientacion_objeto_3;

import java.util.Scanner;

public class GestionaPersonaEj {
		public static void main(String[] args) {

		/*PersonaEj p1 = new PersonaEj("Pepe", 20);
		System.out.println(p1);
		
		PersonaEj p2 = new PersonaEj("Juana", 18);
		System.out.println(p2);
		
	}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un dni");
		String dni = sc.nextLine();
		
		if (dni.matches("\\d{8}[A-Za-z]{1}")) {
			System.out.println("DNI valido");
		}else {
			System.out.println("DNI Invalido");
			}
		
}}


