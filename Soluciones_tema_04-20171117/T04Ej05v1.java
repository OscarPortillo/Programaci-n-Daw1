/*Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma que
 una contenga los caracteres en posición par y la otra los caracteres en posición impar*/
 
import java.util.*;
public class T04Ej05v1 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		String frase, cadenaPar="", cadenaImpar="";
		final int MAX_LONGITUD = 80;
		int i;

		do{
			System.out.println("Frase (max. 80 caracteres): ");
			frase=teclado.nextLine();
		}while(frase.length()>MAX_LONGITUD);
		for (i = 0; i < frase.length(); i=i+2) {
			cadenaPar=cadenaPar+frase.charAt(i);
		}
		for (i = 1; i < frase.length(); i=i+2) {
			cadenaImpar=cadenaImpar+frase.charAt(i);
		}
		System.out.println("Cadena par: " + cadenaPar);
		System.out.println("Cadena impar: " + cadenaImpar);
	}//main

}//class