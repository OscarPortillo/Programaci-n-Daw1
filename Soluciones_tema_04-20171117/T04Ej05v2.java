/*Leer una frase por teclado (máximo 80 car) 
 * y construir otras dos cadenas de forma 
 * que una contenga los caracteres en posición par 
 * y la otra los caracteres en posición impar.*/
import java.util.*;
public class T04Ej05v2 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		String frase, cadenaPar="", cadenaImpar="";
		final int MAX_LONGITUD = 80;
		int indice;
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length()>MAX_LONGITUD);

		for(indice=0;indice<frase.length();indice++){
			if (indice%2==0){//indice par
				cadenaPar=cadenaPar + frase.charAt(indice);
			}else{
				cadenaImpar=cadenaImpar + frase.charAt(indice);
			}//if

		}//for
		System.out.println("Cadena par: " + cadenaPar);
		System.out.println("Cadena impar: " + cadenaImpar);
	}//main

}//class
