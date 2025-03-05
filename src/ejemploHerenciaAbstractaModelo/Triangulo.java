package ejemploHerenciaAbstractaModelo;

public class Triangulo extends Figura {
	
	private double Base;
	private double Altura;
	
	public Triangulo(String color, double Base, double Altura) {
		super(color);
		this.Altura = Altura;
		this.Base = Base;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (Base * Altura)/2;
	}
	
	}



