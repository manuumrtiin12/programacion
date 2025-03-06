package cadenaAlimenticia_modelo;

public class Aves extends Animal {

	

	public Aves(String nombreEspecie, String tipoFamilia, String habitat, String animalesQueCome) {
		super(nombreEspecie, tipoFamilia, habitat, animalesQueCome);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean atacar(Animal a) {
		boolean ataca = true;
		if (a.getTipoFamilia().equals(TipoFamilia.ROEDOR) || a.getTipoFamilia().equals(TipoFamilia.SERPIENTE)){
		} else {
			ataca = false;
		}
		
		return ataca;

	}

	@Override
	boolean huir() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
