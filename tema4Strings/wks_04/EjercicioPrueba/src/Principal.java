import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre = "";
		Leer leer=new Leer();
		 System.out.println("Nombre?");
		  
		 leer.setNombre(teclado.nextLine());
		 System.out.println(nombre);
	}
}
