
public class Principal {

	public static void main(String[] args) {
		Ejercicio6 ejer;//deja declarar la referencia
		ejer=new hijaDe6("lolo");//deja crear objetos de clases que heredan de ella
		
		ejer.metodo();
		Ejercicio6 nieta;
		nieta=new ClaseNieta("lola","martinez");
		System.out.println("Clase nieta");
		nieta.metodo();
		
		/*
		 * no deja crear objetos por que es una clase abstracta 
		 * y de ellas no permite crear objetos
		 */
	}

}
