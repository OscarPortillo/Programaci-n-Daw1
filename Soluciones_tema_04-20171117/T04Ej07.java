/*7.  Leer  una  frase  por  teclado  y  escribir  a  continuación  cuantas  mayúsculas,  minúsculas  y 
números contiene.*/

import java.util.Scanner;

public class T04Ej07 {
	public static void main (String[]args){
		int contador, longitud, contadorMayus, contadorMinus, contadorNumeros;
		char caracter;
		String frase;
		System.out.println("Escribe una frase de 80 caracteres como máximo: ");
		Scanner teclado=new Scanner(System.in);
		frase= teclado.nextLine();
		longitud= frase.length();
		contadorMayus=0;
		contadorMinus=0;
		contadorNumeros=0;
		while(longitud>80){
			System.out.println("La frase es mayor. Escribe una frase de 80 caracteres como máximo: ");
			frase= teclado.nextLine();
			longitud= frase.length();
		}	
		for(contador=0;contador<longitud;contador++){
			caracter=frase.charAt(contador);
			if (caracter>=65 && caracter<=90){
				contadorMayus++;
			} else if( caracter >= 97 && caracter <= 122 ){
				contadorMinus++;
			}else if( caracter >= 48 && caracter <= 57){
				contadorNumeros++;
			}
		}
		System.out.println("Hay " + contadorMayus + " letra(s) mayuscula(s) en la frase");
		System.out.println("Hay " + contadorMinus + " letra(s) minuscula(s) en la frase");
		System.out.println("Hay " + contadorNumeros + " caracter(es) numerico(s) en la frase");
	}//main
}//class