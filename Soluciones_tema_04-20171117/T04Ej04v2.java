/*Leer una cadena de hasta 80 caracteres y pasarla en función de una variable de opción a mayúsculas ó a 
 * minúsculas e imprimir la cadena resultante*/
import java.util.*;
public class T04Ej04v2 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		String frase;
		final int MAX_LONGITUD = 80;
		int opcion;

		do{
			System.out.println("Frase (max. 80 caracteres): ");
			frase=teclado.nextLine();
		}while(frase.length()>MAX_LONGITUD);
		do{
			System.out.println("Pasar a:\n 1.-Mayúsculas\n 2.-Minúsculas\n  Elige opción: ");
			opcion=teclado.nextInt();			
		}while(opcion < 1 && opcion > 2);
		if (opcion == 1){
			frase=frase.toUpperCase();//se modifica el String frase
		}else if (opcion==2)
				frase=frase.toLowerCase();//se modifica el String frase

		System.out.println(frase);
	}//main
	
}//class
