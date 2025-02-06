package Examen1Java;

import java.util.Scanner;

public class Ejercicio1ManuelMartin {

	public static void main(String[] args) {
		
		int Pokedex = 0;
		int RespuestaUsuario = 0;
		
		String [] Menu = null ;{
			System.out.println("        MENU       ");
			System.out.println("1. Capturar Pokemon");
			System.out.println("2. Realizar Batalla");
			System.out.println("3. Mostrar Pokedex ");
			System.out.println("4. Finalizar       ");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Que quieres hacer?");
			int opcion = sc.nextInt();
		

		if (opcion == 1) {
			Scanner sa = new Scanner(System.in);
			System.out.println("Cual es el nombre del Pokemon? ");
			String nombrePokemon = sa.nextLine();
			
			System.out.println("Cual es el nivel del Pokemon? ");
			String nivelPokemon = sa.nextLine();
			
			int sumaPokedex = Pokedex +1  ;
			
			if (Pokedex >= 15) {
				System.out.println("¡Has llegado al limite de tu pokedex!");}}
			
			
	
	
}}}