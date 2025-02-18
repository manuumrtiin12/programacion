package Simulacro;

public class Directivo extends Empleados{
int porcentaje;
private String salarioTotal;

public Directivo(String nombre, String dni, int salarioBase, int porcentaje) {
	super(nombre, dni, salarioBase);
	this.porcentaje = porcentaje;
}

public int getPorcentaje() {
	return porcentaje;
}

public void setPorcentaje(int porcentaje) {
	this.porcentaje = porcentaje;
}

float calcularsalarioTotal (int porcentaje) {
	float dineroPorcentaje = (porcentaje * salarioBase)/100;
	float salarioTotal = dineroPorcentaje + salarioBase;
	return salarioTotal;
	
}
@Override
public String toString() {
	return "Directivo [DNI = " + dni + " - " + " Nombre = " + nombre + " Salario = " + salarioTotal + "]";
}


}
