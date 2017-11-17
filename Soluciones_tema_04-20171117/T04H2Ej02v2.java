/* Escribe un programa que pida por teclado una cadena y una letra, de manera que
elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
por pantalla.*/
import java.util.Scanner;
public class T04H2Ej02v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena, letra, nuevaCadena="";
		int i, cont;
		System.out.printf("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		do{
			System.out.printf("Introduzca una letra: ");
			letra = teclado.nextLine();
		}while(letra.length()>1);
		cont=0;
		for(i=0;i<cadena.length();i++){
			if((cadena.charAt(i)==letra.charAt(0))&&(cont!=3)){
				cont++;
			}
			else{
				nuevaCadena = nuevaCadena + cadena.charAt(i);
			}
		}
		System.out.println(nuevaCadena);
	}//main

}//class
