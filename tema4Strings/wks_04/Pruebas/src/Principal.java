
public class Principal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String s1[][]=new String[3][3];
		Leer leer=new Leer();
		String nombre = "";
		String ape="";
		int edad = 0;
		System.out.println("Introduzca un nombre: ");
		nombre=leer.pedirCadena(nombre);

		System.out.println("Introduce un apellido: ");		
		ape=leer.pedirCadena(ape);
		System.out.println("Introduce la edad: ");
		edad=leer.numAzar(7, 10);
		
		System.out.println("INFO DE LA PERSONA");
		System.out.println("\t Nombre :"+nombre+" \n \t Apellido :"+ape+" \n \t Edad :"+edad);
	}

}
