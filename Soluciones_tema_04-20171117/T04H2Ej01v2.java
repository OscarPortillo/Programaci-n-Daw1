/* Escribir un programa que pida por teclado una cadena y una letra, de manera que
ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y lo
muestre por pantalla.*/
import java.util.Scanner;
public class T04H2Ej01v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena, letra, nuevaCadena="";
		int i;
		System.out.printf("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		do{
			System.out.printf("Introduzca una letra: ");
			letra = teclado.nextLine();
		}while(letra.length()>1);
		for(i=0;i<cadena.length();i++){
			if(cadena.charAt(i)==letra.charAt(0)){
				nuevaCadena = nuevaCadena + letra.toUpperCase();
			}
			else{
				nuevaCadena = nuevaCadena + cadena.charAt(i);
			}
		}
		System.out.println(nuevaCadena);

	}

}
