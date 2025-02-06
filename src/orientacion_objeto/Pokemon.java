package orientacion_objeto;

public class Pokemon {
	String Nombre;
	String Tipo;
	int nivel;
	String Evoluviones;
	
	String convierteEnCadena() 
	{
		String cadena = "Pokemon:"+ Nombre +"nivel:"+ nivel + "Tipo:" + Tipo;
		return cadena;
	}

 	boolean fight (Pokemon p2){
 		boolean gana = true;
 		if (nivel > p2.nivel) {
 			p2.nivel = nivel +1;
 		} else {
 			gana = false;
 			nivel = nivel +1;
 		}
		return gana; 
 	}	
}