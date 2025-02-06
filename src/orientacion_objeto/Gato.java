package orientacion_objeto;

public class Gato {
	String color;
	String raza;
	String sexo;
	int edad;
	int peso;

	void maulla() {
		System.out.println("miauuuuuu");
	}

	void ronronea() {
		System.out.println("rrrrr");
	}

	void QueComida(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy");
		} else {
			System.out.println("Buah, mejor no!");
		}
	}

	void pelea(Gato g) {
		if (sexo.equals(g.sexo))
			System.out.println("ven aqui que te vas a enterar");
		else {
			System.out.println("La violencia nunca es la solucion");
		}
	}

	public Gato(String color, String sexo, int edad, int peso) {
		super();
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		
		
	}

	
}



