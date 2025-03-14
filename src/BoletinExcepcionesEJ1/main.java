package BoletinExcepcionesEJ1;

import java.io.File;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException
	   {
	           //Declaro objeto fichero
	           File fichero = new File("salida.txt");
	           //Lo creo si no existe
	           boolean creado = fichero.createNewFile();
	           
	   }


}
