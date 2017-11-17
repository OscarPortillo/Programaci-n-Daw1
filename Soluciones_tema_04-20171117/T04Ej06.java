/*Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales,
 *  consonantes y caracteres numéricos posee.*/
import java.util.*;
public class T04Ej06 {
	public static void main(String[] args) {
		
		String frase,patronVocales="AEIOU",patronConsonantes="BCDFGHJKLMNÑPQRSTVWXYZ";
		String fraseNueva,patronNumeros="0123456789";
		
		char caracter;
		
		final int MAX_LONGITUD=80;
		int contaVocales, contaConsonantes, contaNumeros, k;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length()>MAX_LONGITUD);
		
		fraseNueva=frase.toUpperCase();
		contaVocales = contaConsonantes = contaNumeros = 0;
		for(k=0; k<=fraseNueva.length()-1;k++){
			caracter=fraseNueva.charAt(k);
			if(patronVocales.indexOf(caracter) != -1){
				contaVocales++;
			}else if(patronConsonantes.indexOf(caracter) != -1){
				contaConsonantes++;
			}else if(patronNumeros.indexOf(caracter) != -1){
				contaNumeros++;
			}
		}//for
		
		System.out.println("En la frase "+ frase + " hay " + contaVocales + " vocal(es) " +
				contaConsonantes + " consonante(s) " + contaNumeros + " numero(s).");
		System.out.println("frase: " + frase);
		System.out.println("fraseNueva: " + fraseNueva);
	}//main

}//class

