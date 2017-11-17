/* Escribe un programa que pida por teclado una cadena y una letra, de manera que
elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
por pantalla.*/
import java.util.Scanner;
public class T04H2Ej02v1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena, letra;
		int contador;
		System.out.printf("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		do{
			System.out.printf("Introduzca una letra: ");
			letra = teclado.nextLine();
		}while(letra.length()>1);

		for(contador = 1; contador <= 3; contador++){
			cadena = cadena.replaceFirst(letra, "");
		}
		System.out.println(cadena);
	}//main

}//class
