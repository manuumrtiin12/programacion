package Examen25_Marzo_Modelo;

import java.util.Arrays;

public class MiembroPremium extends MiembroBase {
	
	private int maximoAmigos[];
	private tipoPremium tipoPremium;

	public MiembroPremium(int id, String email, String nombre, int contadorAmigos, int contadoIdentificador) {
		super(id, email, nombre, contadorAmigos, contadoIdentificador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoUsuario() {
		
		return "PREMIUM: " + tipoPremium;
	}

	public int[] getMaximoAmigos() {
		return maximoAmigos;
	}

	public void setMaximoAmigos(int[] maximoAmigos) {
		this.maximoAmigos = maximoAmigos;
	}

	@Override
	public String toString() {
		return "MiembroPremium [maximoAmigos=" + Arrays.toString(maximoAmigos) + "]";
	}

	
}
