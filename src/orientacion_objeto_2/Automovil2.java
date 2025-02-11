package orientacion_objeto_2;

public class Automovil2 extends Vehiculo2 {
    
    private String calificacionEcologica;
    
    public Automovil2(String dueño, int numPuertas, int numRuedas, String calificacionEcologica) {
        super(dueño, numPuertas, numRuedas); 
        this.calificacionEcologica = calificacionEcologica;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }

   public void imprimeResumen() {
   }
		public String toString() {
			return "Automovil2 [calificacionEcologica=" + calificacionEcologica + ", dueño=" + dueño + ", numPuertas="
					+ numPuertas + ", numRuedas=" + numRuedas + "]";
		}
}
