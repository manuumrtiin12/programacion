package TesteadorQApaquete;

import java.io.IOException;
import java.util.InputMismatchException;

public class GeneradorExcepciones {

	public void generaIOExcepcion() throws IOException  
	{
		try {
			throw new IOException();
		}
		catch (IOException e) 
		{
			System.out.println("En el catch del IO");
			throw e;
		}
		
	}
	
	public void generamISSxception() {
		
		throw new InputMismatchException();
	}
	
}
