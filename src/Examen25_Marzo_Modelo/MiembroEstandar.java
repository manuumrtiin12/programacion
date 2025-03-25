package Examen25_Marzo_Modelo;

public class MiembroEstandar extends MiembroBase {
	
	private int maximoAmigos[];

	public MiembroEstandar(int id, String email, String nombre, int contadorAmigos, int contadoIdentificador) {
		super(id, email, nombre, contadorAmigos, contadoIdentificador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoUsuario() {
		// TODO Auto-generated method stub
		return "Usuario Estandar";
	}

}
