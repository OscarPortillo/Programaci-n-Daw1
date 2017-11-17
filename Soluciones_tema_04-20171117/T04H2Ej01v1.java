/* Escribir un programa que pida por teclado una cadena y una letra, de manera que
ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y lo
muestre por pantalla.*/
import java.util.Scanner;
public class T04H2Ej01v1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena;
		char letra;
		int i;
		System.out.printf("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		do{
			System.out.printf("Introduzca una letra minuscula: ");
			letra = teclado.nextLine().charAt(0);
		}while(letra < 'a' && letra > 'z');
		System.out.println(cadena.replace(letra, (char)(letra - 32)));
	}//main
}//class
