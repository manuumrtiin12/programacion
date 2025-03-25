package Examen25_Marzo2_Controlador;

import Examen25_Marzo2_Modelo.*;

public class GestionaRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ciudad Madrid = new Ciudad(01, "Madrid", null, 20000);
		Ciudad Venzia = new Ciudad(02, "Venzia", null, 20001);
		Ciudad Milan = new Ciudad(03, "Milan", null, 20002);
		Ciudad Sevilla = new Ciudad(04, "Sevilla", null, 20003);
		Ciudad Malaga = new Ciudad(05, "Malaga", null, 20004);
		Ciudad Paris = new Ciudad(06, "Paris", null, 20005);
		
		RutaTerrestre r1 = new RutaTerrestre(1, "Madrid", "Sevilla", 500);
		RutaAerea r2 = new RutaAerea(1, "Milan", "Sevilla", 500, TipoVuelo.EXPRESS, 0);
		RutaAerea r3 = new RutaAerea(1, "Madrid", "Malaga", 500, TipoVuelo.LOW_COST, 0);
		RutaAerea r4 = new RutaAerea(1, "Paris", "Malaga", 500, TipoVuelo.NORMAL, 0);

		
		
	}

}
