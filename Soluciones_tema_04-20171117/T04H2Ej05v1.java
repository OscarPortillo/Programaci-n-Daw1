/*5. Escribe un programa que pida una palabra por teclado e intercambie la última y la
primera letra.*/
import java.util.Scanner;
public class T04H2Ej05v1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palabra, mitadPalabra;
		char letra1, letrafin;

		System.out.println("Palabra: ");
		palabra=teclado.next();  

		letra1=palabra.charAt(0);
		letrafin=palabra.charAt(palabra.length()-1);
		mitadPalabra=palabra.substring(1,palabra.length()-1);
		palabra=letrafin+mitadPalabra+letra1;
		System.out.println(palabra);
	}//main

}
