package Ejercicio4BoletinExcepciones;

import java.util.Random;

public class DivisionesAleatorias {

	public static void main(String[] args) {

		Random random = new Random();
		double[] tablaNumeros = new double[20];
		
		try{ 
			int Numero1 = random.nextInt(10) +1;
			int Numero2 = 0;//random.nextInt(10) +1;
			if(Numero2 == 0) {
				throw new ArithmeticException("No se puede dividir por 0");}}
			
		catch (ArithmeticException e1) {
			
		}
		
		//for(int i = 0; i <= 20; i =+1) {}
			
		}}
		
	


		
			
		

	
