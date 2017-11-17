/*8. Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y
dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del
modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada
carácter se transforme en 3 códigos ASCII mas es decir :
Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
Desarrollar los programas de codificar y descodificar mediante dos funciones.*/

import java.util.Scanner;

public class T04Ej08 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final int MAX_LONGITUD=80;
		String frase;
		String fraseCifrada="";
		int codigo, posicion, longitud, codigoAscii;
		char caracterCifrado, caracterDescifrado;

		System.out.println("Introduce una frase de 80 caracteres como maximo y en mayusculas:");
		frase=teclado.nextLine();
		longitud = frase.length();
		while ( longitud > MAX_LONGITUD || frase.equals( frase.toUpperCase() ) == false ){
			System.out.println("Introduce una frase de 80 caracteres como maximo y en mayusculas:");
			frase=teclado.nextLine();
			longitud = frase.length();
		}

		do{  // filtramos el codigo
			System.out.println("Introduce un numero del 1 al 10 para codificar: ");
			codigo = teclado.nextInt();
		}while( codigo < 1 || codigo > 10);
		
		// codificamos la frase
		posicion = 0;
		while(posicion < longitud){
			codigoAscii = frase.charAt(posicion);			
			caracterCifrado = (char)(codigoAscii + codigo);
			fraseCifrada = fraseCifrada + caracterCifrado;
			posicion++;
		}
		System.out.println("\nFrase codificada:\n" + fraseCifrada);
		
		//decodificamos la frase
		System.out.println("\nFrase original:");
		posicion = 0;
		while(posicion < longitud){
			codigoAscii = fraseCifrada.charAt(posicion);
			caracterDescifrado = (char)(codigoAscii - codigo);
			System.out.print(caracterDescifrado);
			posicion++;
		}
	}//main
}//class
