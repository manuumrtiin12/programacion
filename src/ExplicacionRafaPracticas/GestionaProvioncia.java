package ExplicacionRafaPracticas;

import java.util.LinkedList;
import java.util.List;

public class GestionaProvioncia {

	List<Provincia> provincias = new LinkedList<>();

	public boolean addSinRepetidos(Provincia p) throws ProvinciaException {
		boolean agregado = false;
		if (provincias.contains(p)) {
			throw new ProvinciaException("Provincia repetida");
		} else {
			agregado = provincias.add(p);
		}
		return agregado;
	}

	public Provincia setSinRepetidos(int index, Provincia nuevaProvincia) throws ProvinciaException {
		Provincia actual = provincias.get(index);
		
		if (provincias.contains(nuevaProvincia)) {
			throw new ProvinciaException("Provincia repetido");
		} else {
			actual = provincias.set(index, nuevaProvincia);
		}
		return actual;
	}
	
	public static void main(String[] args) {
		
	}
}
