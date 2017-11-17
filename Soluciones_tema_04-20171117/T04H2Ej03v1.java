/*  Escribe un programa que pida por teclado una palabra y diga si es un palíndromo
o no. Una palabra es un palíndromo si se lee igual de izquierda a derecha que de
derecha a izquierda.*/

import java.util.Scanner;
public class T04H2Ej03v1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String palabra, nuevaPalabra="";
		int i;
		System.out.printf("Introduzca una palabra: ");
		palabra = teclado.next();
		for(i=palabra.length()-1;i>=0;i--){
			nuevaPalabra=nuevaPalabra+palabra.charAt(i);
		}
		if(palabra.equals(nuevaPalabra)){
			System.out.println("La palabra "+palabra+" es palindromo");
		}
		else{
			System.out.println("La palabra "+palabra+" no es palindromo");
		}		

	}//main

}//class

/*Palabras para probar
oso
arañara
reconocer
oro
*/
