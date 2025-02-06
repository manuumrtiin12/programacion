package orientacion_objeto;

public class GestionaPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.Nombre ="Pikachu";
		pikachu.nivel = 12;
		pikachu.Tipo = "Electrico";
		
		Pokemon mew2 = new Pokemon();
		mew2.Nombre = "Mewtwo";
		mew2.nivel = 20;
		mew2.Tipo = "Psiquico";
		
		System.out.println("Pokemon 1:"+pikachu.Nombre);
		System.out.println("Pokemon 2:"+mew2.Nombre);
		
		pikachu.fight(mew2);
	}

}
