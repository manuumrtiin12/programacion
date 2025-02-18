package Simulacro;

public class GestionaEmpleados {
	public static void main(String[] args) {
Administrativo carlos = new Administrativo ("Carlos", "12345678A",1200,40);
Directivo juan = new Directivo ("Juan","87654321B", 2800, 15);

String empleado1 = carlos.toString();
System.out.println(empleado1);

String empleado2 = juan.toString();
System.out.println(empleado2);
	}
}
