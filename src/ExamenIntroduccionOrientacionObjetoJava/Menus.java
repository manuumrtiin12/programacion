package ExamenIntroduccionOrientacionObjetoJava;

import java.time.LocalDate;
import java.util.Objects;

public class Menus {

	private int identificador;
	private String Nombre;
	private int ConsumoCalorico;
	private int precioVenta;
	private int precioCoste;
	private TipoDieta TipoDieta;
	private boolean TieneFrutosSecos;
	private LocalDate DiaDistribucion;
	private int UnidadesRepartidas;

	public Menus(int identificador, String nombre, int consumoCalorico, int precioVenta, int precioCoste,
			ExamenIntroduccionOrientacionObjetoJava.TipoDieta tipoDieta, boolean tieneFrutosSecos,
			LocalDate diaDistribucion, int unidadesRepartidas) {
		super();
		this.identificador = identificador;
		Nombre = nombre;
		ConsumoCalorico = consumoCalorico;
		this.precioVenta = precioVenta;
		this.precioCoste = precioCoste;
		TipoDieta = tipoDieta;
		TieneFrutosSecos = tieneFrutosSecos;
		DiaDistribucion = diaDistribucion;
		UnidadesRepartidas = unidadesRepartidas;
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected String getNombre() {
		return Nombre;
	}

	protected void setNombre(String nombre) {
		Nombre = nombre;
	}

	protected int getConsumoCalorico() {
		return ConsumoCalorico;
	}

	protected void setConsumoCalorico(int consumoCalorico) {
		ConsumoCalorico = consumoCalorico;
	}

	protected int getPrecioVenta() {
		return precioVenta;
	}

	protected void setPrecioVenta(int precioVenta) {
		if(precioVenta < 0);{
			System.out.println("¡El precio no puede ser negativo!");
			
		}
	}

	protected int getPrecioCoste() {
		return precioCoste;
	}

	protected void setPrecioCoste(int precioCoste) {
		if(precioCoste < 0);{
			System.out.println("¡El precio no puede ser negativo!");
			}
	}

	protected TipoDieta getTipoDieta() {
		return TipoDieta;
	}

	protected void setTipoDieta(TipoDieta tipoDieta) {
		TipoDieta = tipoDieta;
	}

	protected boolean isTieneFrutosSecos() {
		return TieneFrutosSecos;
	}

	protected void setTieneFrutosSecos(boolean tieneFrutosSecos) {
		TieneFrutosSecos = tieneFrutosSecos;
	}

	protected LocalDate getDiaDistribucion() {
		return DiaDistribucion;
	}

	protected void setDiaDistribucion(LocalDate diaDistribucion) {
		DiaDistribucion = diaDistribucion;
	}

	protected int getUnidadesRepartidas() {
		return UnidadesRepartidas;
	}

	protected void setUnidadesRepartidas(int unidadesRepartidas) {
		UnidadesRepartidas = unidadesRepartidas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ConsumoCalorico, DiaDistribucion, Nombre, TieneFrutosSecos, TipoDieta, UnidadesRepartidas,
				identificador, precioCoste, precioVenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menus other = (Menus) obj;
		return ConsumoCalorico == other.ConsumoCalorico && Objects.equals(DiaDistribucion, other.DiaDistribucion)
				&& Objects.equals(Nombre, other.Nombre) && TieneFrutosSecos == other.TieneFrutosSecos
				&& TipoDieta == other.TipoDieta && UnidadesRepartidas == other.UnidadesRepartidas
				&& identificador == other.identificador && precioCoste == other.precioCoste
				&& precioVenta == other.precioVenta;
	}

	@Override
	public String toString() {
		return "Menus [+ , Nombre=" + Nombre + ", ConsumoCalorico=" + ConsumoCalorico
				+ ", precioVenta=" + precioVenta + ", precioCoste=" + precioCoste + ", TipoDieta=" + TipoDieta
				+ ", TieneFrutosSecos=" + TieneFrutosSecos + ", DiaDistribucion=" + DiaDistribucion
				+ ", UnidadesRepartidas=" + UnidadesRepartidas + "]";
	}

	String esBajaEnCalorias; {
		if(ConsumoCalorico < 1000) {
			System.out.println("Es una dieta baja en calorias");
		}
	}
	
	String tieneCarne; {
		if (TipoDieta.equals(TipoDieta.VEGETARIANO.VEGANO)) {
			System.out.println("La dieta no contiene carne");
		}
	}
}
