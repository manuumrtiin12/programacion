package orientacion_objeto;

public class GestionaProducto {

	public static void main(String[] args) {
		Producto1 chocolate= new Producto1();
		
		chocolate.nombre="Chocolate";
		chocolate.precioVenta=1.5f;
		chocolate.unidades=9;
		
		int Unidades = chocolate.aumentaUnds(10);
		System.out.println(Unidades);
		
		String cadenaCh = chocolate.convierteCadena();
		System.out.println();
	}

}
