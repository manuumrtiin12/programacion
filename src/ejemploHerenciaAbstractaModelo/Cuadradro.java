package ejemploHerenciaAbstractaModelo;

public class Cuadradro extends Figura
{
   public Cuadradro(String color, double lado) {
		super(color);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

private double lado;

   public double calcularArea()
   {
       return lado*lado;
   }
}
