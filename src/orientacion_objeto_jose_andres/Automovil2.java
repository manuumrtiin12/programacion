package orientacion_objeto_jose_andres;

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
}
