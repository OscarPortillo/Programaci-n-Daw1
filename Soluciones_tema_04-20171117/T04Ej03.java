import java.util.Scanner;

/*3.	Programa que lea una frase y una palabra nos diga la posición de dicha 
 palabra en la frase o un mensaje indicando que no está*/

public class T04Ej03 {

	public static void main(String[] args) {
		final int MAX_LONGITUD = 80;
		int posicion;
		String frase,palabra, buscamos;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de " + MAX_LONGITUD + " caracteres como máximo");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		do{
			System.out.println("Palabra de " + MAX_LONGITUD + " caracteres como máximo");
			palabra = teclado.next();
		}while(palabra.length() > MAX_LONGITUD);
		
		if (frase.startsWith( palabra + " ")){
			System.out.println( "Es la primera palabra de la frase, posicion " + frase.indexOf(palabra) );
		}else if (frase.indexOf( " " + palabra + " ") != -1){ // OJO. El primer caracter de la palabra que buscamos es un espacio
			System.out.println( "La palabra empieza en la posicion " + (frase.indexOf(" " + palabra + " ") + 1) );
		}else if (frase.endsWith( " " + palabra ) ){
			System.out.println("Es la ultima palabra de la frase, posicion " + frase.lastIndexOf(palabra) );
		} else{
			System.out.println("No se encuentra la palabra");
		}
		
	}//main
}//class
