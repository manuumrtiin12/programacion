package orientacion_objeto_2;

public class CuentaBanco1 {

	private double saldo;
	private String numCuenta;
	private Personas1 titular;
	private Personas1 autorizado;

	public CuentaBanco1(double saldo, String numCuenta, Personas1 titular) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.autorizado = autorizado;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Personas1 getTitular() {
		return titular;
	}

	public void setTitular(Personas1 titular) {
		this.titular = titular;
	}

	public Personas1 getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Personas1 autorizado) {
		this.autorizado = autorizado;
	}

	private boolean validacionImportePositivo(double importe) {
		return importe > 0;
	}

	private boolean validarAutorizado(String DNI) {
		return DNI != null && DNI.equals(titular.getDNI());
	}

	public void ingresarDinero(Personas1 personaGestion, double ingreso) {
		if (validarAutorizado(personaGestion.getDNI()) && validacionImportePositivo(ingreso)) {
			setSaldo(getSaldo() + ingreso);

		} else {
			System.out.println("ERROR: No es autorizado o el ingreso es incorrecto");
		}
	}

	public void retiradaDinero(Personas1 personaGestion, double reintegro) {
		if (validarAutorizado(personaGestion.getDNI()) && validacionImportePositivo(reintegro)
				&& getSaldo() >= reintegro) {

		} else {
			System.out.println("ERROR: No es autorizado o ingreso incorrecto o saldo insuficiente");
		}
	}

	public void eliminarAutorizado(String DNI) {
		if (validarAutorizado(DNI)) {
			autorizado = null;
		} else {
			System.out.println("La persona no esta como autorizado");
		}
	}

}
