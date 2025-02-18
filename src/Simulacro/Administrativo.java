package Simulacro;

public class Administrativo extends Empleados{
float extra;
private int salarioTotal;

public Administrativo(String nombre, String dni, int salarioBase, int extra) {
	super(nombre, dni, salarioBase);
	this.extra = extra;
}

public float getExtra() {
	return extra;
}

public void setExtra(int extra) {
	this.extra = extra;
}

float calcularSalarioTotal (float extra) {
	float salarioTotal = salarioBase +extra;
	
	return salarioTotal;
}

@Override
public String toString() {
	return "Administrativo [DNI = "+ dni + " - " + " Nombre =" + nombre + " - " + "Salario" + salarioTotal +"]";
}

}
