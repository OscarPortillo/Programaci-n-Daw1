/*5. Escribe un programa que pida una palabra por teclado e intercambie la última y la
primera letra.*/

import java.util.Scanner;
public class T04H2Ej05v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palabra;
		char letraAux;
		int k;

		System.out.println("Palabra: ");
		palabra=teclado.next();  

		char arrayPalabra[] = palabra.toCharArray();
		
		letraAux = arrayPalabra[0];
		arrayPalabra[0] = arrayPalabra[palabra.length()-1];
		arrayPalabra[palabra.length()-1] = letraAux;
		
		palabra = new String(arrayPalabra);
		
		System.out.println(palabra);
	}//main

}
