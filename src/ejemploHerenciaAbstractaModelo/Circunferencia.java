package ejemploHerenciaAbstractaModelo;

public class Circunferencia extends Figura{
	
	private double radio;
	
	public Circunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 3.14 * (radio*2) ;
	}
	
	}


