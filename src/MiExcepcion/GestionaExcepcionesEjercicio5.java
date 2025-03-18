package MiExcepcion;

import java.util.Scanner;

public class GestionaExcepcionesEjercicio5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println("Dame un numero: ");
		
		try {if(numero%2 != 0) {
			throw new MiExcepcion("Es impar");}}
		
		catch(MiExcepcion e) 
		{
			e.printStackTrace();
			
		}

}}