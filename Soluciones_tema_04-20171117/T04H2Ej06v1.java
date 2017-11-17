/*6. Escribe un programa que pida por teclado una frase y cambie cada ocurrencia de la
palabra “si” por la palabra “no”. Después lo muestra por pantalla.*/

import java.util.Scanner;
public class T04H2Ej06v1 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena;
		int indice;
		System.out.println("Introduzca una frase: ");
		cadena=teclado.nextLine();
		cadena=cadena.replaceFirst("si ", "no ");//si la frase empieza por "si"
		cadena=cadena.replaceAll(" si ", " no ");// si la palabra "si" está en medio
		indice=cadena.lastIndexOf(" si");//si la frase termina por "si"
		if(indice!=-1){
			cadena=cadena.substring(0, indice);
			cadena=cadena + " no";
		}
		System.out.println(cadena);
	}//main
}//class
/*
si quiere que silbe el viento si hace calor pero no si hace frio hay que decir si
*/
