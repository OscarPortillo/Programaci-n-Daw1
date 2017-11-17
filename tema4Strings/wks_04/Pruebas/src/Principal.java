
public class Principal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String s1[][]=new String[3][3];
		Leer leer=new Leer();
		String nombre = "";
		System.out.println("Introduzca un nombre");
		nombre=leer.pedirCadena(nombre);
		System.out.println(nombre);
	}

}
