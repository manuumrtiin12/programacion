package orientacion_objeto;

public class Alumno {
	String Nombre;
	String DNI;
	float Nota;
	
	String convierteCadena() 
	{
		String cadena = "Nombre:" + Nombre + "DNI:" + DNI + "Nota:" + Nota;
		return cadena;
	}
	Boolean aprobado() 
	{
		Boolean aprobado = false;
		
		if (Nota >= 5) {
				aprobado = true; 
		}
		
		else {
			aprobado = false;
		}
		return aprobado; 
	}
	}

/*SEGUIMOS PROBANDO FIUUUU*/
