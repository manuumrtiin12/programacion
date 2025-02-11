package orientacion_objeto_2;

import java.time.LocalDate;

public class ProyectoBanco1 {

	public static void main(String[] args) {

		Personas1 titular = new Personas1("12345678A", "Jose", "Garcia", LocalDate.of(2004, 12, 11));
		CuentaBanco1 cuenta = new CuentaBanco1(0.0, "ES123456789012345678912345", titular);

	}

}
