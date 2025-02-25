package ExpresionesRegulares;

public class ValidaNumero {

	public static void main(String[] args) {
		
		String num = "123";
		String caracter = "A";
		String ocho = "12345678D";
		 
		
		System.out.println(num.matches("\\d+"));
		System.out.println(num.matches("[0-9]*"));
		System.out.println(ocho.matches("\\d{8}[A-Za-z]{1}"));
		System.out.println(caracter.matches("[A-Za-z]{1}"));
		
	}
}
