package ejemploanimalmodelo;

public abstract class Animal {
	String Nombre;

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public abstract String getSonidoQueEmite();
	public abstract String getAlimento();
	
}