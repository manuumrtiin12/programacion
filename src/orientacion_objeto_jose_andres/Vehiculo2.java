package orientacion_objeto_jose_andres;

public class Vehiculo2 {
    
    private String dueño;
    private int numPuertas;
    private int numRuedas;
    
    public Vehiculo2(String dueño, int numPuertas, int numRuedas) {
        this.dueño = dueño;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
}